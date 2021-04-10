/**
 * 
 */


function eliminar (id){
	Swal.fire({
	  title: 'Esta Seguro de Eliminar?',
	  text: "Eliminar Persona",
	  icon: 'warning',
	  showCancelButton: true,
	  confirmButtonColor: '#3085d6',
	  cancelButtonColor: '#d33',
	  cancelButtonText:'No',
	  confirmButtonText: 'Si'
	}).then((result) => {
	  if (result.isConfirmed) {
		
		fetch('/eliminar/'+id)
		.then(response =>{
			
			console.log(response)
	    location.href = "/listar"
	   
		
		})
	    
	  }
	 
})


}





