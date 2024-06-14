import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServicoUrlService } from '@app/servico-url.service';

@Component({
  selector: 'app-encurtamento-url',
  templateUrl: './encurtamento-url.component.html',
  styleUrls: ['./encurtamento-url.component.css']
})
export class EncurtamentoUrlComponent implements OnInit {
  url: string = ''; // Atribuindo um valor inicial vazio

  constructor(private route: ActivatedRoute, private servicoUrl: ServicoUrlService) { }

  ngOnInit() {
    const urlEncurtada: string | null = this.route.snapshot.paramMap.get('urlEncurtada');
    if (urlEncurtada !== null) {
      this.servicoUrl.redirecionarUrl(urlEncurtada).subscribe((urlOriginal: string) => {
        this.url = urlOriginal; // Atribuindo o valor da URL original à propriedade url
      });
    } else {
      console.error('A URL encurtada não foi encontrada na rota.');
    }
  }

  onSubmit() {
    // Adicione aqui a lógica para manipular o envio do formulário, se necessário
  }
}
