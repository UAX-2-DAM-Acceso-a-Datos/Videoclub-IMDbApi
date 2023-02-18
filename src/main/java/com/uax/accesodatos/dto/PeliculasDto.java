package com.uax.accesodatos.dto;

public class PeliculasDto {
        private String id;
        private String titulo;
        private String plot;
        private String imagen;
        private String imDbRating;
        private String trailer;
        private String runtimeStr;
        private String pegi;

        public PeliculasDto(String id, String titulo, String plot, String imagen, String imDbRating, String trailer,
                        String runtimeStr, String pegi) {
                this.id = id;
                this.titulo = titulo;
                this.plot = plot;
                this.imagen = imagen;
                this.imDbRating = imDbRating;
                this.trailer = trailer;
                this.runtimeStr = runtimeStr;
                this.pegi = pegi;
        }
        public PeliculasDto() {
        }
        public String getId() {
                return id;
        }
        public void setId(String id) {
                this.id = id;
        }
        public String getTitulo() {
                return titulo;
        }
        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }
        public String getPlot() {
                return plot;
        }
        public void setPlot(String plot) {
                this.plot = plot;
        }
        public String getImagen() {
                return imagen;
        }
        public void setImagen(String imagen) {
                this.imagen = imagen;
        }
        public String getImDbRating() {
                return imDbRating;
        }
        public void setImDbRating(String imDbRating) {
                this.imDbRating = imDbRating;
        }
        public String getTrailer() {
                return trailer;
        }
        public void setTrailer(String trailer) {
                this.trailer = trailer;
        }
        public String getRuntimeStr() {
                return runtimeStr;
        }
        public void setRuntimeStr(String runtimeStr) {
                this.runtimeStr = runtimeStr;
        }
        public String getPegi() {
                return pegi;
        }
        public void setPegi(String pegi) {
                this.pegi = pegi;
        }


}
