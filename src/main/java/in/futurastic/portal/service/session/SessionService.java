package in.futurastic.portal.service.session;

import in.futurastic.portal.model.session.SessionModel;

import java.util.List;

public interface SessionService {
    SessionModel createNewSession(SessionModel sessionModel);
    List<SessionModel> getAllSessions();
}
