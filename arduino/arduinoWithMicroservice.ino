char c;

void setup() {
     pinMode(7,INPUT);
     pinMode(2,INPUT);

     pinMode(13,OUTPUT);

     Serial.begin(9600);
     c='4';
}

void loop() {
      int lum=digitalRead(7); 
      int mouv=digitalRead(2); 
    
      int se=mouv+lum;
      Serial.println(se);
        delay(1000);
    
  
      if(c=='4'){
        readfrom();
      }

      if(c=='2'){
        digitalWrite(13,HIGH); 
        
        readfrom();

      }
      else{
        if(c=='3'){
         
          digitalWrite(13,LOW); 
          
        readfrom();



          
        }
      }
                 //if light is not present,LED on


}

void readfrom(){
    while (Serial.available()) { 
    c = Serial.read(); 
    
    //Serial.println(c); 
    if(c=='2'){
             
        break;
    }
    else{
      if(c=='3'){
       
        break;
      }
      else{
        c='4';
       
        break;
           

      }
        
    }
    delay(50);
  }
}
