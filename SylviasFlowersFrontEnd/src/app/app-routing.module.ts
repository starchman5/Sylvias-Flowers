import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MainComponent } from './components/main/main.component';
import { RegisterComponent } from './components/register/register.component';

const routes: Routes = [

  {path: '', component: MainComponent, pathMatch: "full"},
  {path: 'main', component: MainComponent},
  {path: 'register', component: RegisterComponent},


  {path:'**', component: MainComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
