import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../../models/user';

@Injectable()
export class UserService {
  users: User[];

  constructor (private http: HttpClient) {}

  getUsers() {
  }

  getUserById(id: string) {
  }

  getUserByName(username: string) {
    const tokenUrl = 'http://localhost:8080/rest/user/userName';
    const headers = new HttpHeaders({'Content-Type': 'application/json', 'Authorization': 'Bearer ' + localStorage.getItem('token')});

    return this.http.post<User>(tokenUrl, username, { headers: headers });
  }

  updateUser(user: User) {
    const tokenUrl1 = 'http://localhost:8080/rest/user/update';
    const headers1 = new HttpHeaders({'Content-Type': 'application/json', 'Authorization': 'Bearer ' + localStorage.getItem('token')});
    return this.http.post(tokenUrl1, user, {headers: headers1});
  }

}
