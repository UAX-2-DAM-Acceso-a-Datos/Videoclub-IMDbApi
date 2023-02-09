-- Crear BBDD
CREATE DATABASE dbs10004441;

-- Create table users y authorites Sprring security
create table users(
	username varchar(50) not null primary key,
	password varchar(150) not null,
	enabled boolean not null
);

create table authorities (
	username varchar(50) not null,
	authority varchar(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);

create unique index ix_auth_username on authorities (username,authority);

-- Create table usuario
create table usuario (
    id_usuario int not null primary key, 
    username varchar(50) not null,
    telefono varchar(12) not null,
    email varchar(200) not null,
    foreign key(username) references users(username) on delete cascade on update cascade
)

-- Create table peliculas
create table peliculas (
    id varchar(20) not null primary key,
    titulo varchar(100) not null,
    plot varchar(1000),
    imagen varchar(200) not null,
    imDbRating varchar(10) not null,
    trailer varchar(200),
    runtimeStr varchar(15) not null,
    pegi varchar(10) not null,
)

-- Create table Generos
create table genero(
    id_genero int not null primary key,
    genero varchar(40)
)

-- Create table pelicula_genero
create table pelicula_genero(
    id varchar(20) not null ,
    id_genero int not null,
    primary key (id,id_genero),
    foreign key(id) references peliculas(id) on delete cascade on update cascade,
    foreign key(id_genero) references genero(id_genero) on delete on update cascade
)

-- Create table favoritos
create table favoritos(
    id_usuario int not null,
    id varchar(20) not null,
    primary key(id_usuario, id),
    foreign key(id_usuario) references usuario(id_usuario) ON delete cascade on update cascade,
    foreign key(id) references peliculas(id) on delete cascade on update cascade
)

-- Create table reservas
create table reservas(
    id varchar(20) not null,
    id_usuario int not null,
    fecha_ini varchar(30),
    fecha_fin varchar(30),
    primary key(id_usuario, id),
    foreign key(id_usuario) references usuario(id_usuario) ON delete cascade on update cascade,
    foreign key(id) references peliculas(id) on delete cascade on update cascade
)