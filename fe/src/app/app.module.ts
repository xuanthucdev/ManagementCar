import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductComponent } from './product.component/product.component';
import { BaseUrlService } from './service/BaseUrl.service';
import { ProductService } from './service/product.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { ButtonModule } from 'primeng/button';

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ButtonModule
  ],
  providers: [
    BaseUrlService,
    ProductService
  ],
  bootstrap: [ProductComponent]
})
export class AppModule { }
