class UrlMappings {

	static mappings = {// "/"{ controller='Usuario'  action='/index'}
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
