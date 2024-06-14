import { Component, OnInit } from '@angular/core';
import { ServicoUrlService } from '@app/servico-url.service';

@Component({
  selector: 'app-listagem-url',
  templateUrl: './listagem-url.component.html',
  styleUrls: ['./listagem-url.component.css']
})
export class ListagemUrlComponent implements OnInit { // Adicione "Component" ao nome da classe
  urls: string[] = [];
  
  constructor(private servicoUrl: ServicoUrlService) { }

  ngOnInit() {
    this.servicoUrl.listarUrls().subscribe(urls => {
      this.urls = urls;
    });
  }
}
