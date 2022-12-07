import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  save(user : any) {
   console.log("save() in UserService");
   console.log("Full Name:"+user.fullName);
   console.log("Full Name:"+user.gender);

  }

  constructor() { }
}
