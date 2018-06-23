package in.futurastic.portal.service.session;

import in.futurastic.portal.model.session.SessionModel;
import in.futurastic.portal.repository.session.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sessionService")
public class SessionServiceImpl implements SessionService {
    @Autowired
    SessionRepository sessionRepository;

    @Override
    public SessionModel createNewSession(SessionModel sessionModel) {
        return sessionRepository.save(sessionModel);
    }

    @Override
    public List<SessionModel> getAllSessions() {
        return sessionRepository.findAll();
    }
}
