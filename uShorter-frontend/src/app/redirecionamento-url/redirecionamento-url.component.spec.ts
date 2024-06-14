import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RedirecionamentoUrlComponent } from './redirecionamento-url.component';

describe('RedirecionamentoUrlComponent', () => {
  let component: RedirecionamentoUrlComponent;
  let fixture: ComponentFixture<RedirecionamentoUrlComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RedirecionamentoUrlComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RedirecionamentoUrlComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
