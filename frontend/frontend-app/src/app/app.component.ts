import { Component , OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { response } from 'express';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

  
 export class AppComponent implements OnInit {
  title = 'job-portal';
  data  :any;

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.http.get<any[]>('http://localhost:5000/register')
      .subscribe(data => {
        this.data = data;
        console.log(data);
      });
  } 
}
