import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServicoUrlService } from '@app/servico-url.service';

@Component({
  selector: 'app-redirecionamento-url', // Renomear o seletor para corresponder ao nome atual da classe
  templateUrl: './redirecionamento-url.component.html',
  styleUrls: ['./redirecionamento-url.component.css']
})
export class RedirecionamentoUrlComponent implements OnInit { // Renomear a classe para corresponder ao nome do arquivo
  constructor(private route: ActivatedRoute, private servicoUrl: ServicoUrlService) { }

  ngOnInit() {
    const urlCurta = this.route.snapshot.paramMap.get('urlCurta');
    if (urlCurta !== null) {
      this.servicoUrl.redirecionarUrl(urlCurta).subscribe((urlOriginal: string) => {
        window.location.href = urlOriginal;
      });
    } else {
      console.error('O parâmetro "urlCurta" não foi encontrado na rota.');
    }
  }
}
