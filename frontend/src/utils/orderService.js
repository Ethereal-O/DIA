import {postrequest} from "./ajax";

let preurl="http://localhost:8080/";

export const checkloginservice=(checkdata,callback)=>{
    const url=preurl+"checkloginservice";
    postrequest(url,checkdata,callback);
}

export const trylogoutservice=(callback)=>{
    const url=preurl+"trylogoutservice";
    postrequest(url,null,callback);
}

export function registerservice(registerdata,callback)
{
    const url=preurl+"registerservice";
    postrequest(url,registerdata,callback);
}

export function getallbookdataservice(callback)
{
    const url=preurl+"getallbookdataservice";
    postrequest(url,null,callback);
}

export function addcartservice(addcartdata,callback)
{
    const url=preurl+"addcartservice";
    postrequest(url,addcartdata,callback);
}

export function adminchangedataservice(admindata,callback)
{
    const url=preurl+"adminchangedataservice";
    postrequest(url,admindata,callback);
}

export function admindeletebookservice(list,callback)
{
    const url=preurl+"admindeletebookservice";
    postrequest(url,list,callback);
}

export function adminaddbookservice(list,callback)
{
    const url=preurl+"adminaddbookservice";
    postrequest(url,list,callback);
}

export function getusercartdataservice(username,callback)
{
    const url=preurl+"getusercartdataservice";
    postrequest(url,username,callback);
}

export function userdeletecartdataservice(deletedata,callback)
{
    const url=preurl+"userdeletecartdataservice";
    postrequest(url,deletedata,callback);
}

export function usercleancartservice(username,callback)
{
    const url=preurl+"usercleancartservice";
    postrequest(url,username,callback);
}

export function getusershelfdataservice(username,callback)
{
    const url=preurl+"getusershelfdataservice";
    postrequest(url,username,callback);
}

export function getalluserdataservice(callback)
{
    const url=preurl+"getalluserdataservice";
    postrequest(url,null,callback);
}

export function adminchangeuserdataservice(admindata,callback)
{
    const url=preurl+"adminchangeuserdataservice";
    postrequest(url,admindata,callback);
}

export function admindeleteuserdataservice(list,callback)
{
    const url=preurl+"admindeleteuserdataservice";
    postrequest(url,list,callback);
}

export function getallorderdataservice(callback)
{
    const url=preurl+"getallorderdataservice";
    postrequest(url,null,callback);
}

export function adminaddorderservice(adminaddorderdata,callback)
{
    const url=preurl+"adminaddorderservice";
    postrequest(url,adminaddorderdata,callback);
}

export function admindeleteorderservice(admindeleteorderdata,callback)
{
    const url=preurl+"admindeleteorderservice";
    postrequest(url,admindeleteorderdata,callback);
}