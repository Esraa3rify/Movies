package com.example.pojo;

public class MovieModel {
        String name;
        String data;
        String description;
        int ID;

        public MovieModel(  String name, String data, String description, int ID )
        {
            this.name=name;
            this.data=data;
            this.description=description;
            this.ID=ID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }
    }


