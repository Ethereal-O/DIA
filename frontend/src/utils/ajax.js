export function postrequest(url,data,callback){
    let opts={
        method:"POST",
        body:data,
        credentials:"include"
    }
    fetch(url,opts).then((response)=>{return response.json()})
        .then((data)=>{callback(data)})
        .catch(()=>{
            alert("Permission denied!")
            window.location.href="/";
        });

}