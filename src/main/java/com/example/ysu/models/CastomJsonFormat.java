package com.example.ysu.models;

public class CastomJsonFormat<T> {

        private String massage;
        private Integer sucsses;

        private T jsonReturner;

        public String getMassage() {
            return massage;
        }

        public void setMassage(String massage) {
            this.massage = massage;
        }

        public Integer getSucsses() {
            return sucsses;
        }

        public void setSucsses(Integer sucsses) {
            this.sucsses = sucsses;
        }

        public T getJsonReturner() {
            return jsonReturner;
        }

        public void setJsonReturner(T jsonReturner) {
            this.jsonReturner = jsonReturner;
        }
    }

