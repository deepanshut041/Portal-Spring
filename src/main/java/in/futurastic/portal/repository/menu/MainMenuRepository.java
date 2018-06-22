package in.futurastic.portal.repository.menu;

import in.futurastic.portal.model.menu.MainMenuModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainMenuRepository extends JpaRepository<MainMenuModel, Long> {
}