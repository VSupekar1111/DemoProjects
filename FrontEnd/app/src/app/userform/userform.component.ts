import { Component } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent {
firstName="Vkas";
user={
  fullName:"Vikas Babasaheb Supekar",
  gender:"M"
}
constructor(public userservice:UserService){

}
public save(){
  console.log("hello");
  this.userservice.save(this.user);
 // console.error("error occured: "+this.firstName);
}
}
