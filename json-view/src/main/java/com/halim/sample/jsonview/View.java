package com.halim.sample.jsonview;

public class View {//Enclosing type to define User views
    public  interface UserView {      //External View for User
        interface External {
        }
        //Intenal View for User, will inherit all filds in External
        interface Internal extends External {
        }
    }
}