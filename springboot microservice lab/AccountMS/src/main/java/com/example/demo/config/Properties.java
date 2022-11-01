package com.example.demo.config;

public class Properties{
	
	
					private String message;
                    private String buildversion;
                    private String mail;
                    private String subject;
                   
                    public Properties(String msg,String bv,String ml,String sub){
                          message=msg;
                          buildversion=bv;
                          mail=ml;
                          subject=sub;
                    }

					public String getMessage() {
						return message;
					}

					public void setMessage(String message) {
						this.message = message;
					}

					public String getBuildversion() {
						return buildversion;
					}

					public void setBuildversion(String buildversion) {
						this.buildversion = buildversion;
					}

					public String getMail() {
						return mail;
					}

					public void setMail(String mail) {
						this.mail = mail;
					}

					public String getSubject() {
						return subject;
					}

					public void setSubject(String subject) {
						this.subject = subject;
					}
                    
                    
                    
                    

            }
