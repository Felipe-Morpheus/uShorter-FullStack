import { ComponentFixture, TestBed } from '@angular/core/testing';
import { EncurtamentoUrlComponent } from './encurtamento-url.component';

describe('EncurtamentoUrlComponent', () => { // Corrija o nome para corresponder ao componente testado
  let component: EncurtamentoUrlComponent;
  let fixture: ComponentFixture<EncurtamentoUrlComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EncurtamentoUrlComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EncurtamentoUrlComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
