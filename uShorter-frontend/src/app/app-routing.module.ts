import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EncurtamentoUrlComponent } from './encurtamento-url/encurtamento-url.component';
import { ListagemUrlComponent } from './listagem-url/listagem-url.component';
import { RedirecionamentoUrlComponent } from './redirecionamento-url/redirecionamento-url.component';

const routes: Routes = [
  { path: '', redirectTo: '/encurtar', pathMatch: 'full' }, // Rota inicial, redireciona para /encurtar
  { path: 'encurtar', component: EncurtamentoUrlComponent }, // Rota para o componente de encurtamento de URL
  { path: 'listar', component: ListagemUrlComponent }, // Rota para o componente de listagem de URLs
  { path: 'redirecionar/:urlCurta', component: RedirecionamentoUrlComponent }, // Rota para redirecionamento de URL com parâmetro
  { path: '**', redirectTo: '/encurtar' } // Rota para lidar com URLs não encontradas
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
