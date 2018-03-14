import { Component } from '@angular/core';
import { Http } from '@angular/http';
import { OnInit } from '@angular/core';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Tu Ip es:';
  result: string = '';

  constructor(private http: Http){
  }

  ngOnInit(){
    this.getIp();
  }

public getIp(): void {
  this.result='cargando....'
  this.http.get('http://127.0.0.1:8080/mostrar/ip').subscribe(
    response => this.result=response.text()
  );
}

}
