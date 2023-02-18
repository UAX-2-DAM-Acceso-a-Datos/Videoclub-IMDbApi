-- Spring user schema
create table users(
	username varchar_ignorecase(50) not null primary key,
	password varchar(150) not null,
	enabled boolean not null
);

create table authorities (
	username varchar_ignorecase(50) not null,
	authority varchar_ignorecase(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

-- Tabla usuarios
create table usuario (
    username varchar(50) not null,
    telefono varchar(12) not null,
    email varchar(200) not null,
    fechNac date not null,
    primary key(username),
    foreign key(username) references users(username) on delete cascade on update cascade 
)Engine = InnoDB;

-- Tabla Peliculas
create table peliculas(
    id varchar(30) not null,
    titulo varchar(200) not null,
    plot varchar(1000) not null,
    imagen varchar(200) not null,
    imDbRating varchar(10) not null,
    trailer varchar(200) not null default 'N/A',
    runtimeStr varchar(15) not null,
    pegi varchar(10) not null default 'N/A',
    primary key(id)
)Engine=InnoDB;

-- Tabla genero
create table genero (
    id_genero int not null,
    genero varchar(40) not null,
    primary key(id_genero)
)Engine = InnoDB;

-- Tabla pelicula_genero
create table pelicula_genero (
    id varchar(30) not null,
    id_genero int not null,
    primary key(id,id_genero),
    foreign key(id) references peliculas(id) on delete cascade on update cascade,
    foreign key(id_genero) references genero(id_genero) on delete cascade on update cascade
)Engine = InnoDB;

-- Tabla favoritos
create table favoritos (
    id varchar(30) not null,
    username varchar(50) not null,
    primary key(id, username),
    foreign key(id) references peliculas(id) on update cascade on delete cascade,
    foreign key(username) references usuario(username) on update cascade on delete cascade
)Engine = InnoDB;

-- Tabla reservas
create table reservas(
    username varchar(50) not null,
    id varchar(30) not null,
    fecha_ini varchar(30) not null,
    fecha_fin varchar(30) not null,
    precio double not null,
    estado varchar(20) not null,
    pagado varchar(30) not null,
    primary key(username,id),
    foreign key(username) references usuario(username) on update cascade on delete cascade,
    foreign key(id) references peliculas(id) on update cascade on delete cascade
)Engine = InnoDB;
