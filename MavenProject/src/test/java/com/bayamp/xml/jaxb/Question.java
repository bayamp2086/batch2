package com.bayamp.xml.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;  
  
//@XmlRootElement  
@XmlRootElement(name="question")
//@XmlAccessorType(XmlAccessType.FIELD)
public class Question {  
	
private int id;  


private String questionname;

private List<Answer> answers; 



//public Question() {} 
//
//public Question(int id, String questionname, List<Answer> answers) {  
//    super();  
//    this.id = id;  
//    this.questionname = questionname;  
//    this.answers = answers;  
//}  


public void setId(int id) {  
    this.id = id;  
} 

public void setQuestionname(String questionname) {  
    this.questionname = questionname;  
} 

public void setAnswers(List<Answer> answers) {  
    this.answers = answers;  
} 

@XmlAttribute  
public int getId() {  
    return id;  
}  
 
@XmlElement
public String getQuestionname() {  
    return questionname;  
}  
 

@XmlElement  
public List<Answer> getAnswers() {  
    return answers;  
}  
 
}  
