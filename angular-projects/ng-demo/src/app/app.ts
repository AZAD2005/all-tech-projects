import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, CommonModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('ng-demo');

  isTrue: boolean = true;

 message: string = '';
    isClicked = false;
    getMessage() {
        this.isClicked = !this.isClicked;
        if (this.isClicked) {
            this.message = 'Welcome to GFG!!!';
        } else {
            this.message = '';
        }
    }


}
