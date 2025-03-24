import { Component, Injectable, OnInit } from "@angular/core";
import { ProductService } from "../service/product.service";


  @Component({
    selector: 'app-root',
    templateUrl: './product.component.html',
  })
  export class ProductComponent implements OnInit {
    products: any = [];
    constructor(
      private productService : ProductService
    ){}
    ngOnInit(): void {
      this.findAll();

    }
    findAll() {
      this.productService.findAll().then(
        res => {
          console.log(res);
          this.products = res;
        }
      );
    }
  }