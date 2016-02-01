package tutorial.rest.resources.asm;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;


import tutorial.core.entity.BlogEntry;
import tutorial.rest.mvc.BlogEntryController;
import tutorial.rest.resources.BlogEntryResources;

public class BlogEntryResourceAsm extends  ResourceAssemblerSupport<BlogEntry, BlogEntryResources>{

	public BlogEntryResourceAsm() {
		super(BlogEntryController.class, BlogEntryResources.class);
	}

	@Override
	public BlogEntryResources toResource(BlogEntry arg0) {
		BlogEntryResources res = new BlogEntryResources();
		res.setTitle(arg0.getTitle());
		 Link link = linkTo(BlogEntryController.class).slash(arg0.getId()).withSelfRel();
        res.add(link);
		return res;
	}

}
