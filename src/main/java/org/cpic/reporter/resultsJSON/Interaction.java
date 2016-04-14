package org.cpic.reporter.resultsJSON;

import java.util.List;

import org.cpic.reporter.model.CPICinteraction;
import org.cpic.reporter.model.Group;
import org.cpic.reporter.model.RelatedChemical;

public class Interaction {
    private List<Group> groupList;
    private List<RelatedChemical> relatedChemicals;
    private String source;
    private String summaryHtml;
    private String textHtml;
    
    public Interaction( CPICinteraction inter){
        this.relatedChemicals = inter.getRelatedChemicals();
        this.source = inter.getSource();
        this.summaryHtml = inter.getSummaryHtml();
        this.textHtml = inter.getTextHtml();        
    }

    public void addAllToGroup(List<Group> gList ){
        groupList.addAll( gList );
    }
}
