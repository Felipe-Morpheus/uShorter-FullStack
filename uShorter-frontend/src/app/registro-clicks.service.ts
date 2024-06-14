import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServicoRegistroClickUrl {
  constructor(private http: HttpClient) { }

  registrarClick(url: string) {
    return this.http.post('/urlclicks/registrar', { url });
  }
}
