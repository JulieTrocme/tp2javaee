package montp.web.controllers;

import montp.web.UserSession;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@ViewScoped
@Named
public class AccueilView implements Serializable {

    @Inject
    UserSession userSession;
}
