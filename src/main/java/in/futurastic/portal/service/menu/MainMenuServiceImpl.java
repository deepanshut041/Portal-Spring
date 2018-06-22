package in.futurastic.portal.service.menu;

import in.futurastic.portal.repository.menu.MainMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MainMenuServiceImpl implements MainMenuService {

    @Autowired
    MainMenuRepository mainMenuRepository;

}
