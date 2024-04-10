import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MainHeaderComponent } from './main-header/main-header.component';
import {MatIconModule} from '@angular/material/icon';


@NgModule({
  declarations: [
    MainHeaderComponent
  ],
  imports: [
    CommonModule,
    MatIconModule
  ],
  exports: [
    MainHeaderComponent
  ]
})
export class CoreModule { }
