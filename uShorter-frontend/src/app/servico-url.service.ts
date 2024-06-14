import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServicoUrlService {
  private baseUrl = 'http://localhost:8080'; // URL base do backend

  constructor(private http: HttpClient) { }

  encurtarUrl(url: string): Observable<string> {
    // Lógica para encurtar a URL no backend
    return this.http.post<string>(`${this.baseUrl}/urls/encurtar`, { url });
  }

  redirecionarUrl(urlCurta: string): Observable<string> {
    // Lógica para redirecionar a URL original no backend
    return this.http.get<string>(`${this.baseUrl}/urls/${urlCurta}`);
  }

  listarUrls(): Observable<string[]> {
    // Lógica para obter a lista de URLs encurtadas do backend
    return this.http.get<string[]>(`${this.baseUrl}/urls/listar`);
  }
}
