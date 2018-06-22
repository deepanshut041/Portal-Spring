package in.futurastic.portal.service.menu;

import in.futurastic.portal.model.menu.SubMenuModel;
import in.futurastic.portal.repository.menu.SubMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SubMenuServiceIml implements SubMenuService {
    @Autowired
    SubMenuRepository subMenuRepository;
}
