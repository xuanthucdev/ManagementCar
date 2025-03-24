import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { lastValueFrom } from "rxjs";
import { BaseUrlService } from "./BaseUrl.service";

@Injectable()
export class ProductService {

    constructor(
        private baseUrlService: BaseUrlService,
        private httpClient: HttpClient
    ) { }
    
    async findAll() {
        // return await this.httpClient.get(this.baseUrlService.getBaseUrl() + "artist/findAll");
        return await lastValueFrom(this.httpClient.get(this.baseUrlService.getBaseUrl() + "products/findAll"));
    }
}