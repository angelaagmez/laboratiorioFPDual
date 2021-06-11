package edu.fpdual.web.fpdualweb.api.dto;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;



@Getter

@Setter

@AllArgsConstructor

@NoArgsConstructor

@XmlRootElement(name="notification")

public class Notification {



               private int id;

               private String title;

               private String body;

}
