import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListagemUrlComponent } from './listagem-url.component';

describe('ListagemUrlComponent', () => {
  let component: ListagemUrlComponent;
  let fixture: ComponentFixture<ListagemUrlComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListagemUrlComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListagemUrlComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
