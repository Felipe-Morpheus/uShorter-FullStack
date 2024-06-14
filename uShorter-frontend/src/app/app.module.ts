import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms'; // Importe FormsModule

import { EncurtamentoUrlComponent } from './encurtamento-url/encurtamento-url.component';

@NgModule({
  declarations: [
    EncurtamentoUrlComponent
  ],
  imports: [
    CommonModule,
    FormsModule // Adicione FormsModule aos imports
  ],
  exports: [
    EncurtamentoUrlComponent
  ]
})
export class EncurtamentoUrlModule { }
