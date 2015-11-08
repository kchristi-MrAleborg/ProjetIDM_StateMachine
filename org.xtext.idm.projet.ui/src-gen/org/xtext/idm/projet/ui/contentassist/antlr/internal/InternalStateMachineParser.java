package org.xtext.idm.projet.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.idm.projet.services.StateMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'StateMachine'", "'{'", "'events'", "'}'", "','", "'var'", "':'", "'integer'", "':='", "'boolean'", "'state'", "'init'", "'with'", "'do'", "';'", "'from'", "'to'", "'for'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStateMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g"; }


     
     	private StateMachineGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(StateMachineGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleStateMachine"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:60:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:61:1: ( ruleStateMachine EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:62:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_entryRuleStateMachine61);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMachine68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:69:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:73:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:74:1: ( ( rule__StateMachine__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:74:1: ( ( rule__StateMachine__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:75:1: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:76:1: ( rule__StateMachine__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:76:2: rule__StateMachine__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine94);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:88:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:89:1: ( ruleVariable EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:90:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable121);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:97:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:101:2: ( ( ( rule__Variable__Alternatives ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:102:1: ( ( rule__Variable__Alternatives ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:102:1: ( ( rule__Variable__Alternatives ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:103:1: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:104:1: ( rule__Variable__Alternatives )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:104:2: rule__Variable__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Alternatives_in_ruleVariable154);
            rule__Variable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleintegerVariable"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:116:1: entryRuleintegerVariable : ruleintegerVariable EOF ;
    public final void entryRuleintegerVariable() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:117:1: ( ruleintegerVariable EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:118:1: ruleintegerVariable EOF
            {
             before(grammarAccess.getIntegerVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleintegerVariable_in_entryRuleintegerVariable181);
            ruleintegerVariable();

            state._fsp--;

             after(grammarAccess.getIntegerVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleintegerVariable188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleintegerVariable"


    // $ANTLR start "ruleintegerVariable"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:125:1: ruleintegerVariable : ( ( rule__IntegerVariable__Group__0 ) ) ;
    public final void ruleintegerVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:129:2: ( ( ( rule__IntegerVariable__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:130:1: ( ( rule__IntegerVariable__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:130:1: ( ( rule__IntegerVariable__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:131:1: ( rule__IntegerVariable__Group__0 )
            {
             before(grammarAccess.getIntegerVariableAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:132:1: ( rule__IntegerVariable__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:132:2: rule__IntegerVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__0_in_ruleintegerVariable214);
            rule__IntegerVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleintegerVariable"


    // $ANTLR start "entryRulebooleanVariable"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:144:1: entryRulebooleanVariable : rulebooleanVariable EOF ;
    public final void entryRulebooleanVariable() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:145:1: ( rulebooleanVariable EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:146:1: rulebooleanVariable EOF
            {
             before(grammarAccess.getBooleanVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleanVariable_in_entryRulebooleanVariable241);
            rulebooleanVariable();

            state._fsp--;

             after(grammarAccess.getBooleanVariableRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleanVariable248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebooleanVariable"


    // $ANTLR start "rulebooleanVariable"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:153:1: rulebooleanVariable : ( ( rule__BooleanVariable__Group__0 ) ) ;
    public final void rulebooleanVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:157:2: ( ( ( rule__BooleanVariable__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:158:1: ( ( rule__BooleanVariable__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:158:1: ( ( rule__BooleanVariable__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:159:1: ( rule__BooleanVariable__Group__0 )
            {
             before(grammarAccess.getBooleanVariableAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:160:1: ( rule__BooleanVariable__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:160:2: rule__BooleanVariable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__0_in_rulebooleanVariable274);
            rule__BooleanVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebooleanVariable"


    // $ANTLR start "entryRuleintegerData"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:174:1: entryRuleintegerData : ruleintegerData EOF ;
    public final void entryRuleintegerData() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:175:1: ( ruleintegerData EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:176:1: ruleintegerData EOF
            {
             before(grammarAccess.getIntegerDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleintegerData_in_entryRuleintegerData303);
            ruleintegerData();

            state._fsp--;

             after(grammarAccess.getIntegerDataRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleintegerData310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleintegerData"


    // $ANTLR start "ruleintegerData"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:183:1: ruleintegerData : ( ( rule__IntegerData__Group__0 ) ) ;
    public final void ruleintegerData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:187:2: ( ( ( rule__IntegerData__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:188:1: ( ( rule__IntegerData__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:188:1: ( ( rule__IntegerData__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:189:1: ( rule__IntegerData__Group__0 )
            {
             before(grammarAccess.getIntegerDataAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:190:1: ( rule__IntegerData__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:190:2: rule__IntegerData__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerData__Group__0_in_ruleintegerData336);
            rule__IntegerData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleintegerData"


    // $ANTLR start "entryRulebooleanData"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:202:1: entryRulebooleanData : rulebooleanData EOF ;
    public final void entryRulebooleanData() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:203:1: ( rulebooleanData EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:204:1: rulebooleanData EOF
            {
             before(grammarAccess.getBooleanDataRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleanData_in_entryRulebooleanData363);
            rulebooleanData();

            state._fsp--;

             after(grammarAccess.getBooleanDataRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleanData370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebooleanData"


    // $ANTLR start "rulebooleanData"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:211:1: rulebooleanData : ( ( rule__BooleanData__Group__0 ) ) ;
    public final void rulebooleanData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:215:2: ( ( ( rule__BooleanData__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:216:1: ( ( rule__BooleanData__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:216:1: ( ( rule__BooleanData__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:217:1: ( rule__BooleanData__Group__0 )
            {
             before(grammarAccess.getBooleanDataAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:218:1: ( rule__BooleanData__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:218:2: rule__BooleanData__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanData__Group__0_in_rulebooleanData396);
            rule__BooleanData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebooleanData"


    // $ANTLR start "entryRuleBool"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:230:1: entryRuleBool : ruleBool EOF ;
    public final void entryRuleBool() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:231:1: ( ruleBool EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:232:1: ruleBool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBool_in_entryRuleBool423);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBool430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:239:1: ruleBool : ( ( rule__Bool__Alternatives ) ) ;
    public final void ruleBool() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:243:2: ( ( ( rule__Bool__Alternatives ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:244:1: ( ( rule__Bool__Alternatives ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:244:1: ( ( rule__Bool__Alternatives ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:245:1: ( rule__Bool__Alternatives )
            {
             before(grammarAccess.getBoolAccess().getAlternatives()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:246:1: ( rule__Bool__Alternatives )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:246:2: rule__Bool__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bool__Alternatives_in_ruleBool456);
            rule__Bool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:258:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:259:1: ( ruleEvent EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:260:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_entryRuleEvent483);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvent490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:267:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:271:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:272:1: ( ( rule__Event__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:272:1: ( ( rule__Event__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:273:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:274:1: ( rule__Event__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:274:2: rule__Event__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__0_in_ruleEvent516);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleoneState"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:286:1: entryRuleoneState : ruleoneState EOF ;
    public final void entryRuleoneState() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:287:1: ( ruleoneState EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:288:1: ruleoneState EOF
            {
             before(grammarAccess.getOneStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoneState_in_entryRuleoneState543);
            ruleoneState();

            state._fsp--;

             after(grammarAccess.getOneStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoneState550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleoneState"


    // $ANTLR start "ruleoneState"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:295:1: ruleoneState : ( ( rule__OneState__Alternatives ) ) ;
    public final void ruleoneState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:299:2: ( ( ( rule__OneState__Alternatives ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:300:1: ( ( rule__OneState__Alternatives ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:300:1: ( ( rule__OneState__Alternatives ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:301:1: ( rule__OneState__Alternatives )
            {
             before(grammarAccess.getOneStateAccess().getAlternatives()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:302:1: ( rule__OneState__Alternatives )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:302:2: rule__OneState__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__OneState__Alternatives_in_ruleoneState576);
            rule__OneState__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOneStateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleoneState"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:314:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:315:1: ( ruleState EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:316:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState603);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:323:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:327:2: ( ( ( rule__State__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:328:1: ( ( rule__State__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:328:1: ( ( rule__State__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:329:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:330:1: ( rule__State__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:330:2: rule__State__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0_in_ruleState636);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleCompositeState"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:342:1: entryRuleCompositeState : ruleCompositeState EOF ;
    public final void entryRuleCompositeState() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:343:1: ( ruleCompositeState EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:344:1: ruleCompositeState EOF
            {
             before(grammarAccess.getCompositeStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositeState_in_entryRuleCompositeState663);
            ruleCompositeState();

            state._fsp--;

             after(grammarAccess.getCompositeStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeState670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeState"


    // $ANTLR start "ruleCompositeState"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:351:1: ruleCompositeState : ( ( rule__CompositeState__Group__0 ) ) ;
    public final void ruleCompositeState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:355:2: ( ( ( rule__CompositeState__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:356:1: ( ( rule__CompositeState__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:356:1: ( ( rule__CompositeState__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:357:1: ( rule__CompositeState__Group__0 )
            {
             before(grammarAccess.getCompositeStateAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:358:1: ( rule__CompositeState__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:358:2: rule__CompositeState__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__0_in_ruleCompositeState696);
            rule__CompositeState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeState"


    // $ANTLR start "entryRuleInitialState"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:370:1: entryRuleInitialState : ruleInitialState EOF ;
    public final void entryRuleInitialState() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:371:1: ( ruleInitialState EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:372:1: ruleInitialState EOF
            {
             before(grammarAccess.getInitialStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_entryRuleInitialState723);
            ruleInitialState();

            state._fsp--;

             after(grammarAccess.getInitialStateRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitialState730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:379:1: ruleInitialState : ( ( rule__InitialState__Group__0 ) ) ;
    public final void ruleInitialState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:383:2: ( ( ( rule__InitialState__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:384:1: ( ( rule__InitialState__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:384:1: ( ( rule__InitialState__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:385:1: ( rule__InitialState__Group__0 )
            {
             before(grammarAccess.getInitialStateAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:386:1: ( rule__InitialState__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:386:2: rule__InitialState__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__0_in_ruleInitialState756);
            rule__InitialState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:398:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:399:1: ( ruleOperation EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:400:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation783);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:407:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:411:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:412:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:412:1: ( ( rule__Operation__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:413:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:414:1: ( rule__Operation__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:414:2: rule__Operation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0_in_ruleOperation816);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleAssignment"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:426:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:427:1: ( ruleAssignment EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:428:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment843);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:435:1: ruleAssignment : ( ( rule__Assignment__Alternatives ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:439:2: ( ( ( rule__Assignment__Alternatives ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:440:1: ( ( rule__Assignment__Alternatives ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:440:1: ( ( rule__Assignment__Alternatives ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:441:1: ( rule__Assignment__Alternatives )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:442:1: ( rule__Assignment__Alternatives )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:442:2: rule__Assignment__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Alternatives_in_ruleAssignment876);
            rule__Assignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleBooleanAssignment"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:454:1: entryRuleBooleanAssignment : ruleBooleanAssignment EOF ;
    public final void entryRuleBooleanAssignment() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:455:1: ( ruleBooleanAssignment EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:456:1: ruleBooleanAssignment EOF
            {
             before(grammarAccess.getBooleanAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment903);
            ruleBooleanAssignment();

            state._fsp--;

             after(grammarAccess.getBooleanAssignmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanAssignment910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanAssignment"


    // $ANTLR start "ruleBooleanAssignment"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:463:1: ruleBooleanAssignment : ( ( rule__BooleanAssignment__Group__0 ) ) ;
    public final void ruleBooleanAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:467:2: ( ( ( rule__BooleanAssignment__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:468:1: ( ( rule__BooleanAssignment__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:468:1: ( ( rule__BooleanAssignment__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:469:1: ( rule__BooleanAssignment__Group__0 )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:470:1: ( rule__BooleanAssignment__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:470:2: rule__BooleanAssignment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment__Group__0_in_ruleBooleanAssignment936);
            rule__BooleanAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanAssignment"


    // $ANTLR start "entryRuleIntegerAssignment"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:482:1: entryRuleIntegerAssignment : ruleIntegerAssignment EOF ;
    public final void entryRuleIntegerAssignment() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:483:1: ( ruleIntegerAssignment EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:484:1: ruleIntegerAssignment EOF
            {
             before(grammarAccess.getIntegerAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment963);
            ruleIntegerAssignment();

            state._fsp--;

             after(grammarAccess.getIntegerAssignmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerAssignment970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerAssignment"


    // $ANTLR start "ruleIntegerAssignment"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:491:1: ruleIntegerAssignment : ( ( rule__IntegerAssignment__Group__0 ) ) ;
    public final void ruleIntegerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:495:2: ( ( ( rule__IntegerAssignment__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:496:1: ( ( rule__IntegerAssignment__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:496:1: ( ( rule__IntegerAssignment__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:497:1: ( rule__IntegerAssignment__Group__0 )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:498:1: ( rule__IntegerAssignment__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:498:2: rule__IntegerAssignment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment__Group__0_in_ruleIntegerAssignment996);
            rule__IntegerAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerAssignment"


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:510:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:511:1: ( ruleTransition EOF )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:512:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition1023);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:519:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:523:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:524:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:524:1: ( ( rule__Transition__Group__0 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:525:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:526:1: ( rule__Transition__Group__0 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:526:2: rule__Transition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0_in_ruleTransition1056);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__Variable__Alternatives"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:538:1: rule__Variable__Alternatives : ( ( ruleintegerVariable ) | ( rulebooleanVariable ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:542:1: ( ( ruleintegerVariable ) | ( rulebooleanVariable ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==19) ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3==22) ) {
                            alt1=2;
                        }
                        else if ( (LA1_3==20) ) {
                            alt1=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:543:1: ( ruleintegerVariable )
                    {
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:543:1: ( ruleintegerVariable )
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:544:1: ruleintegerVariable
                    {
                     before(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleintegerVariable_in_rule__Variable__Alternatives1092);
                    ruleintegerVariable();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:549:6: ( rulebooleanVariable )
                    {
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:549:6: ( rulebooleanVariable )
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:550:1: rulebooleanVariable
                    {
                     before(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulebooleanVariable_in_rule__Variable__Alternatives1109);
                    rulebooleanVariable();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__Bool__Alternatives"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:561:1: rule__Bool__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Bool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:565:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:566:1: ( 'true' )
                    {
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:566:1: ( 'true' )
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:567:1: 'true'
                    {
                     before(grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Bool__Alternatives1143); 
                     after(grammarAccess.getBoolAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:574:6: ( 'false' )
                    {
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:574:6: ( 'false' )
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:575:1: 'false'
                    {
                     before(grammarAccess.getBoolAccess().getFalseKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Bool__Alternatives1163); 
                     after(grammarAccess.getBoolAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Alternatives"


    // $ANTLR start "rule__OneState__Alternatives"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:587:1: rule__OneState__Alternatives : ( ( ruleState ) | ( ruleCompositeState ) );
    public final void rule__OneState__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:591:1: ( ( ruleState ) | ( ruleCompositeState ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==14) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==23) ) {
                            alt3=2;
                        }
                        else if ( (LA3_3==16||LA3_3==26) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:592:1: ( ruleState )
                    {
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:592:1: ( ruleState )
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:593:1: ruleState
                    {
                     before(grammarAccess.getOneStateAccess().getStateParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_rule__OneState__Alternatives1197);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getOneStateAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:598:6: ( ruleCompositeState )
                    {
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:598:6: ( ruleCompositeState )
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:599:1: ruleCompositeState
                    {
                     before(grammarAccess.getOneStateAccess().getCompositeStateParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeState_in_rule__OneState__Alternatives1214);
                    ruleCompositeState();

                    state._fsp--;

                     after(grammarAccess.getOneStateAccess().getCompositeStateParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneState__Alternatives"


    // $ANTLR start "rule__Assignment__Alternatives"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:609:1: rule__Assignment__Alternatives : ( ( ruleBooleanAssignment ) | ( ruleIntegerAssignment ) );
    public final void rule__Assignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:613:1: ( ( ruleBooleanAssignment ) | ( ruleIntegerAssignment ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==21) ) {
                        int LA4_3 = input.LA(4);

                        if ( ((LA4_3>=11 && LA4_3<=12)) ) {
                            alt4=1;
                        }
                        else if ( (LA4_3==RULE_INT) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==21) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3>=11 && LA4_3<=12)) ) {
                        alt4=1;
                    }
                    else if ( (LA4_3==RULE_INT) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:614:1: ( ruleBooleanAssignment )
                    {
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:614:1: ( ruleBooleanAssignment )
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:615:1: ruleBooleanAssignment
                    {
                     before(grammarAccess.getAssignmentAccess().getBooleanAssignmentParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanAssignment_in_rule__Assignment__Alternatives1246);
                    ruleBooleanAssignment();

                    state._fsp--;

                     after(grammarAccess.getAssignmentAccess().getBooleanAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:620:6: ( ruleIntegerAssignment )
                    {
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:620:6: ( ruleIntegerAssignment )
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:621:1: ruleIntegerAssignment
                    {
                     before(grammarAccess.getAssignmentAccess().getIntegerAssignmentParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerAssignment_in_rule__Assignment__Alternatives1263);
                    ruleIntegerAssignment();

                    state._fsp--;

                     after(grammarAccess.getAssignmentAccess().getIntegerAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Alternatives"


    // $ANTLR start "rule__StateMachine__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:633:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:637:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:638:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__01293);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__01296);
            rule__StateMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:645:1: rule__StateMachine__Group__0__Impl : ( () ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:649:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:650:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:650:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:651:1: ()
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:652:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:654:1: 
            {
            }

             after(grammarAccess.getStateMachineAccess().getStateMachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:664:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:668:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:669:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__11354);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__11357);
            rule__StateMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:676:1: rule__StateMachine__Group__1__Impl : ( 'StateMachine' ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:680:1: ( ( 'StateMachine' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:681:1: ( 'StateMachine' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:681:1: ( 'StateMachine' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:682:1: 'StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__StateMachine__Group__1__Impl1385); 
             after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:695:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:699:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:700:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__21416);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__21419);
            rule__StateMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:707:1: rule__StateMachine__Group__2__Impl : ( ( rule__StateMachine__NameAssignment_2 ) ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:711:1: ( ( ( rule__StateMachine__NameAssignment_2 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:712:1: ( ( rule__StateMachine__NameAssignment_2 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:712:1: ( ( rule__StateMachine__NameAssignment_2 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:713:1: ( rule__StateMachine__NameAssignment_2 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_2()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:714:1: ( rule__StateMachine__NameAssignment_2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:714:2: rule__StateMachine__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__NameAssignment_2_in_rule__StateMachine__Group__2__Impl1446);
            rule__StateMachine__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:724:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:728:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:729:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__31476);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__31479);
            rule__StateMachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:736:1: rule__StateMachine__Group__3__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:740:1: ( ( '{' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:741:1: ( '{' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:741:1: ( '{' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:742:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__StateMachine__Group__3__Impl1507); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:755:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:759:1: ( rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:760:2: rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__41538);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__41541);
            rule__StateMachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:767:1: rule__StateMachine__Group__4__Impl : ( ( rule__StateMachine__VariablesAssignment_4 )* ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:771:1: ( ( ( rule__StateMachine__VariablesAssignment_4 )* ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:772:1: ( ( rule__StateMachine__VariablesAssignment_4 )* )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:772:1: ( ( rule__StateMachine__VariablesAssignment_4 )* )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:773:1: ( rule__StateMachine__VariablesAssignment_4 )*
            {
             before(grammarAccess.getStateMachineAccess().getVariablesAssignment_4()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:774:1: ( rule__StateMachine__VariablesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:774:2: rule__StateMachine__VariablesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__VariablesAssignment_4_in_rule__StateMachine__Group__4__Impl1568);
            	    rule__StateMachine__VariablesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getVariablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__StateMachine__Group__5"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:784:1: rule__StateMachine__Group__5 : rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 ;
    public final void rule__StateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:788:1: ( rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:789:2: rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__51599);
            rule__StateMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__51602);
            rule__StateMachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5"


    // $ANTLR start "rule__StateMachine__Group__5__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:796:1: rule__StateMachine__Group__5__Impl : ( 'events' ) ;
    public final void rule__StateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:800:1: ( ( 'events' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:801:1: ( 'events' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:801:1: ( 'events' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:802:1: 'events'
            {
             before(grammarAccess.getStateMachineAccess().getEventsKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__StateMachine__Group__5__Impl1630); 
             after(grammarAccess.getStateMachineAccess().getEventsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5__Impl"


    // $ANTLR start "rule__StateMachine__Group__6"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:815:1: rule__StateMachine__Group__6 : rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7 ;
    public final void rule__StateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:819:1: ( rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:820:2: rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__61661);
            rule__StateMachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__7_in_rule__StateMachine__Group__61664);
            rule__StateMachine__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6"


    // $ANTLR start "rule__StateMachine__Group__6__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:827:1: rule__StateMachine__Group__6__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:831:1: ( ( '{' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:832:1: ( '{' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:832:1: ( '{' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:833:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__StateMachine__Group__6__Impl1692); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6__Impl"


    // $ANTLR start "rule__StateMachine__Group__7"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:846:1: rule__StateMachine__Group__7 : rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8 ;
    public final void rule__StateMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:850:1: ( rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:851:2: rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__7__Impl_in_rule__StateMachine__Group__71723);
            rule__StateMachine__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__8_in_rule__StateMachine__Group__71726);
            rule__StateMachine__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__7"


    // $ANTLR start "rule__StateMachine__Group__7__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:858:1: rule__StateMachine__Group__7__Impl : ( ( rule__StateMachine__EventsAssignment_7 ) ) ;
    public final void rule__StateMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:862:1: ( ( ( rule__StateMachine__EventsAssignment_7 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:863:1: ( ( rule__StateMachine__EventsAssignment_7 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:863:1: ( ( rule__StateMachine__EventsAssignment_7 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:864:1: ( rule__StateMachine__EventsAssignment_7 )
            {
             before(grammarAccess.getStateMachineAccess().getEventsAssignment_7()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:865:1: ( rule__StateMachine__EventsAssignment_7 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:865:2: rule__StateMachine__EventsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__EventsAssignment_7_in_rule__StateMachine__Group__7__Impl1753);
            rule__StateMachine__EventsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getEventsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__7__Impl"


    // $ANTLR start "rule__StateMachine__Group__8"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:875:1: rule__StateMachine__Group__8 : rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9 ;
    public final void rule__StateMachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:879:1: ( rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:880:2: rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__8__Impl_in_rule__StateMachine__Group__81783);
            rule__StateMachine__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__9_in_rule__StateMachine__Group__81786);
            rule__StateMachine__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__8"


    // $ANTLR start "rule__StateMachine__Group__8__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:887:1: rule__StateMachine__Group__8__Impl : ( ( rule__StateMachine__Group_8__0 )* ) ;
    public final void rule__StateMachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:891:1: ( ( ( rule__StateMachine__Group_8__0 )* ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:892:1: ( ( rule__StateMachine__Group_8__0 )* )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:892:1: ( ( rule__StateMachine__Group_8__0 )* )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:893:1: ( rule__StateMachine__Group_8__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_8()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:894:1: ( rule__StateMachine__Group_8__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:894:2: rule__StateMachine__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_8__0_in_rule__StateMachine__Group__8__Impl1813);
            	    rule__StateMachine__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__8__Impl"


    // $ANTLR start "rule__StateMachine__Group__9"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:904:1: rule__StateMachine__Group__9 : rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10 ;
    public final void rule__StateMachine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:908:1: ( rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:909:2: rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__9__Impl_in_rule__StateMachine__Group__91844);
            rule__StateMachine__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__10_in_rule__StateMachine__Group__91847);
            rule__StateMachine__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__9"


    // $ANTLR start "rule__StateMachine__Group__9__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:916:1: rule__StateMachine__Group__9__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:920:1: ( ( '}' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:921:1: ( '}' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:921:1: ( '}' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:922:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__StateMachine__Group__9__Impl1875); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__9__Impl"


    // $ANTLR start "rule__StateMachine__Group__10"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:935:1: rule__StateMachine__Group__10 : rule__StateMachine__Group__10__Impl rule__StateMachine__Group__11 ;
    public final void rule__StateMachine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:939:1: ( rule__StateMachine__Group__10__Impl rule__StateMachine__Group__11 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:940:2: rule__StateMachine__Group__10__Impl rule__StateMachine__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__10__Impl_in_rule__StateMachine__Group__101906);
            rule__StateMachine__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__11_in_rule__StateMachine__Group__101909);
            rule__StateMachine__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__10"


    // $ANTLR start "rule__StateMachine__Group__10__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:947:1: rule__StateMachine__Group__10__Impl : ( ( rule__StateMachine__StatesAssignment_10 ) ) ;
    public final void rule__StateMachine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:951:1: ( ( ( rule__StateMachine__StatesAssignment_10 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:952:1: ( ( rule__StateMachine__StatesAssignment_10 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:952:1: ( ( rule__StateMachine__StatesAssignment_10 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:953:1: ( rule__StateMachine__StatesAssignment_10 )
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_10()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:954:1: ( rule__StateMachine__StatesAssignment_10 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:954:2: rule__StateMachine__StatesAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__StatesAssignment_10_in_rule__StateMachine__Group__10__Impl1936);
            rule__StateMachine__StatesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__10__Impl"


    // $ANTLR start "rule__StateMachine__Group__11"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:964:1: rule__StateMachine__Group__11 : rule__StateMachine__Group__11__Impl rule__StateMachine__Group__12 ;
    public final void rule__StateMachine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:968:1: ( rule__StateMachine__Group__11__Impl rule__StateMachine__Group__12 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:969:2: rule__StateMachine__Group__11__Impl rule__StateMachine__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__11__Impl_in_rule__StateMachine__Group__111966);
            rule__StateMachine__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__12_in_rule__StateMachine__Group__111969);
            rule__StateMachine__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__11"


    // $ANTLR start "rule__StateMachine__Group__11__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:976:1: rule__StateMachine__Group__11__Impl : ( ( rule__StateMachine__StatesAssignment_11 )* ) ;
    public final void rule__StateMachine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:980:1: ( ( ( rule__StateMachine__StatesAssignment_11 )* ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:981:1: ( ( rule__StateMachine__StatesAssignment_11 )* )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:981:1: ( ( rule__StateMachine__StatesAssignment_11 )* )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:982:1: ( rule__StateMachine__StatesAssignment_11 )*
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_11()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:983:1: ( rule__StateMachine__StatesAssignment_11 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:983:2: rule__StateMachine__StatesAssignment_11
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__StatesAssignment_11_in_rule__StateMachine__Group__11__Impl1996);
            	    rule__StateMachine__StatesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__11__Impl"


    // $ANTLR start "rule__StateMachine__Group__12"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:993:1: rule__StateMachine__Group__12 : rule__StateMachine__Group__12__Impl rule__StateMachine__Group__13 ;
    public final void rule__StateMachine__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:997:1: ( rule__StateMachine__Group__12__Impl rule__StateMachine__Group__13 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:998:2: rule__StateMachine__Group__12__Impl rule__StateMachine__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__12__Impl_in_rule__StateMachine__Group__122027);
            rule__StateMachine__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__13_in_rule__StateMachine__Group__122030);
            rule__StateMachine__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__12"


    // $ANTLR start "rule__StateMachine__Group__12__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1005:1: rule__StateMachine__Group__12__Impl : ( ( rule__StateMachine__InitialStateAssignment_12 ) ) ;
    public final void rule__StateMachine__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1009:1: ( ( ( rule__StateMachine__InitialStateAssignment_12 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1010:1: ( ( rule__StateMachine__InitialStateAssignment_12 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1010:1: ( ( rule__StateMachine__InitialStateAssignment_12 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1011:1: ( rule__StateMachine__InitialStateAssignment_12 )
            {
             before(grammarAccess.getStateMachineAccess().getInitialStateAssignment_12()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1012:1: ( rule__StateMachine__InitialStateAssignment_12 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1012:2: rule__StateMachine__InitialStateAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__InitialStateAssignment_12_in_rule__StateMachine__Group__12__Impl2057);
            rule__StateMachine__InitialStateAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getInitialStateAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__12__Impl"


    // $ANTLR start "rule__StateMachine__Group__13"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1022:1: rule__StateMachine__Group__13 : rule__StateMachine__Group__13__Impl rule__StateMachine__Group__14 ;
    public final void rule__StateMachine__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1026:1: ( rule__StateMachine__Group__13__Impl rule__StateMachine__Group__14 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1027:2: rule__StateMachine__Group__13__Impl rule__StateMachine__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__13__Impl_in_rule__StateMachine__Group__132087);
            rule__StateMachine__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__14_in_rule__StateMachine__Group__132090);
            rule__StateMachine__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__13"


    // $ANTLR start "rule__StateMachine__Group__13__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1034:1: rule__StateMachine__Group__13__Impl : ( ( rule__StateMachine__TransitionsAssignment_13 ) ) ;
    public final void rule__StateMachine__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1038:1: ( ( ( rule__StateMachine__TransitionsAssignment_13 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1039:1: ( ( rule__StateMachine__TransitionsAssignment_13 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1039:1: ( ( rule__StateMachine__TransitionsAssignment_13 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1040:1: ( rule__StateMachine__TransitionsAssignment_13 )
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_13()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1041:1: ( rule__StateMachine__TransitionsAssignment_13 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1041:2: rule__StateMachine__TransitionsAssignment_13
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__TransitionsAssignment_13_in_rule__StateMachine__Group__13__Impl2117);
            rule__StateMachine__TransitionsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__13__Impl"


    // $ANTLR start "rule__StateMachine__Group__14"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1051:1: rule__StateMachine__Group__14 : rule__StateMachine__Group__14__Impl rule__StateMachine__Group__15 ;
    public final void rule__StateMachine__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1055:1: ( rule__StateMachine__Group__14__Impl rule__StateMachine__Group__15 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1056:2: rule__StateMachine__Group__14__Impl rule__StateMachine__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__14__Impl_in_rule__StateMachine__Group__142147);
            rule__StateMachine__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__15_in_rule__StateMachine__Group__142150);
            rule__StateMachine__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__14"


    // $ANTLR start "rule__StateMachine__Group__14__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1063:1: rule__StateMachine__Group__14__Impl : ( ( rule__StateMachine__TransitionsAssignment_14 )* ) ;
    public final void rule__StateMachine__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1067:1: ( ( ( rule__StateMachine__TransitionsAssignment_14 )* ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1068:1: ( ( rule__StateMachine__TransitionsAssignment_14 )* )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1068:1: ( ( rule__StateMachine__TransitionsAssignment_14 )* )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1069:1: ( rule__StateMachine__TransitionsAssignment_14 )*
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_14()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1070:1: ( rule__StateMachine__TransitionsAssignment_14 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1070:2: rule__StateMachine__TransitionsAssignment_14
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__StateMachine__TransitionsAssignment_14_in_rule__StateMachine__Group__14__Impl2177);
            	    rule__StateMachine__TransitionsAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__14__Impl"


    // $ANTLR start "rule__StateMachine__Group__15"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1080:1: rule__StateMachine__Group__15 : rule__StateMachine__Group__15__Impl ;
    public final void rule__StateMachine__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1084:1: ( rule__StateMachine__Group__15__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1085:2: rule__StateMachine__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group__15__Impl_in_rule__StateMachine__Group__152208);
            rule__StateMachine__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__15"


    // $ANTLR start "rule__StateMachine__Group__15__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1091:1: rule__StateMachine__Group__15__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1095:1: ( ( '}' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1096:1: ( '}' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1096:1: ( '}' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1097:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_15()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__StateMachine__Group__15__Impl2236); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__15__Impl"


    // $ANTLR start "rule__StateMachine__Group_8__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1142:1: rule__StateMachine__Group_8__0 : rule__StateMachine__Group_8__0__Impl rule__StateMachine__Group_8__1 ;
    public final void rule__StateMachine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1146:1: ( rule__StateMachine__Group_8__0__Impl rule__StateMachine__Group_8__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1147:2: rule__StateMachine__Group_8__0__Impl rule__StateMachine__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_8__0__Impl_in_rule__StateMachine__Group_8__02299);
            rule__StateMachine__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_8__1_in_rule__StateMachine__Group_8__02302);
            rule__StateMachine__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__0"


    // $ANTLR start "rule__StateMachine__Group_8__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1154:1: rule__StateMachine__Group_8__0__Impl : ( ',' ) ;
    public final void rule__StateMachine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1158:1: ( ( ',' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1159:1: ( ',' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1159:1: ( ',' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1160:1: ','
            {
             before(grammarAccess.getStateMachineAccess().getCommaKeyword_8_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__StateMachine__Group_8__0__Impl2330); 
             after(grammarAccess.getStateMachineAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_8__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1173:1: rule__StateMachine__Group_8__1 : rule__StateMachine__Group_8__1__Impl ;
    public final void rule__StateMachine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1177:1: ( rule__StateMachine__Group_8__1__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1178:2: rule__StateMachine__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__Group_8__1__Impl_in_rule__StateMachine__Group_8__12361);
            rule__StateMachine__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__1"


    // $ANTLR start "rule__StateMachine__Group_8__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1184:1: rule__StateMachine__Group_8__1__Impl : ( ( rule__StateMachine__EventsAssignment_8_1 ) ) ;
    public final void rule__StateMachine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1188:1: ( ( ( rule__StateMachine__EventsAssignment_8_1 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1189:1: ( ( rule__StateMachine__EventsAssignment_8_1 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1189:1: ( ( rule__StateMachine__EventsAssignment_8_1 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1190:1: ( rule__StateMachine__EventsAssignment_8_1 )
            {
             before(grammarAccess.getStateMachineAccess().getEventsAssignment_8_1()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1191:1: ( rule__StateMachine__EventsAssignment_8_1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1191:2: rule__StateMachine__EventsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StateMachine__EventsAssignment_8_1_in_rule__StateMachine__Group_8__1__Impl2388);
            rule__StateMachine__EventsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getEventsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__1__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1205:1: rule__IntegerVariable__Group__0 : rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1 ;
    public final void rule__IntegerVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1209:1: ( rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1210:2: rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__0__Impl_in_rule__IntegerVariable__Group__02422);
            rule__IntegerVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__1_in_rule__IntegerVariable__Group__02425);
            rule__IntegerVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__0"


    // $ANTLR start "rule__IntegerVariable__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1217:1: rule__IntegerVariable__Group__0__Impl : ( () ) ;
    public final void rule__IntegerVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1221:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1222:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1222:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1223:1: ()
            {
             before(grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1224:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1226:1: 
            {
            }

             after(grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__0__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1236:1: rule__IntegerVariable__Group__1 : rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2 ;
    public final void rule__IntegerVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1240:1: ( rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1241:2: rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__1__Impl_in_rule__IntegerVariable__Group__12483);
            rule__IntegerVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__2_in_rule__IntegerVariable__Group__12486);
            rule__IntegerVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__1"


    // $ANTLR start "rule__IntegerVariable__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1248:1: rule__IntegerVariable__Group__1__Impl : ( 'var' ) ;
    public final void rule__IntegerVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1252:1: ( ( 'var' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1253:1: ( 'var' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1253:1: ( 'var' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1254:1: 'var'
            {
             before(grammarAccess.getIntegerVariableAccess().getVarKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__IntegerVariable__Group__1__Impl2514); 
             after(grammarAccess.getIntegerVariableAccess().getVarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__1__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1267:1: rule__IntegerVariable__Group__2 : rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3 ;
    public final void rule__IntegerVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1271:1: ( rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1272:2: rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__2__Impl_in_rule__IntegerVariable__Group__22545);
            rule__IntegerVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__3_in_rule__IntegerVariable__Group__22548);
            rule__IntegerVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__2"


    // $ANTLR start "rule__IntegerVariable__Group__2__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1279:1: rule__IntegerVariable__Group__2__Impl : ( ( rule__IntegerVariable__NameAssignment_2 ) ) ;
    public final void rule__IntegerVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1283:1: ( ( ( rule__IntegerVariable__NameAssignment_2 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1284:1: ( ( rule__IntegerVariable__NameAssignment_2 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1284:1: ( ( rule__IntegerVariable__NameAssignment_2 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1285:1: ( rule__IntegerVariable__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerVariableAccess().getNameAssignment_2()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1286:1: ( rule__IntegerVariable__NameAssignment_2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1286:2: rule__IntegerVariable__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__NameAssignment_2_in_rule__IntegerVariable__Group__2__Impl2575);
            rule__IntegerVariable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerVariableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__2__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__3"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1296:1: rule__IntegerVariable__Group__3 : rule__IntegerVariable__Group__3__Impl rule__IntegerVariable__Group__4 ;
    public final void rule__IntegerVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1300:1: ( rule__IntegerVariable__Group__3__Impl rule__IntegerVariable__Group__4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1301:2: rule__IntegerVariable__Group__3__Impl rule__IntegerVariable__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__3__Impl_in_rule__IntegerVariable__Group__32605);
            rule__IntegerVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__4_in_rule__IntegerVariable__Group__32608);
            rule__IntegerVariable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__3"


    // $ANTLR start "rule__IntegerVariable__Group__3__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1308:1: rule__IntegerVariable__Group__3__Impl : ( ':' ) ;
    public final void rule__IntegerVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1312:1: ( ( ':' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1313:1: ( ':' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1313:1: ( ':' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1314:1: ':'
            {
             before(grammarAccess.getIntegerVariableAccess().getColonKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__IntegerVariable__Group__3__Impl2636); 
             after(grammarAccess.getIntegerVariableAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__3__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1327:1: rule__IntegerVariable__Group__4 : rule__IntegerVariable__Group__4__Impl rule__IntegerVariable__Group__5 ;
    public final void rule__IntegerVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1331:1: ( rule__IntegerVariable__Group__4__Impl rule__IntegerVariable__Group__5 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1332:2: rule__IntegerVariable__Group__4__Impl rule__IntegerVariable__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__4__Impl_in_rule__IntegerVariable__Group__42667);
            rule__IntegerVariable__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__5_in_rule__IntegerVariable__Group__42670);
            rule__IntegerVariable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__4"


    // $ANTLR start "rule__IntegerVariable__Group__4__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1339:1: rule__IntegerVariable__Group__4__Impl : ( 'integer' ) ;
    public final void rule__IntegerVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1343:1: ( ( 'integer' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1344:1: ( 'integer' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1344:1: ( 'integer' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1345:1: 'integer'
            {
             before(grammarAccess.getIntegerVariableAccess().getIntegerKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__IntegerVariable__Group__4__Impl2698); 
             after(grammarAccess.getIntegerVariableAccess().getIntegerKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__4__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__5"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1358:1: rule__IntegerVariable__Group__5 : rule__IntegerVariable__Group__5__Impl ;
    public final void rule__IntegerVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1362:1: ( rule__IntegerVariable__Group__5__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1363:2: rule__IntegerVariable__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group__5__Impl_in_rule__IntegerVariable__Group__52729);
            rule__IntegerVariable__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__5"


    // $ANTLR start "rule__IntegerVariable__Group__5__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1369:1: rule__IntegerVariable__Group__5__Impl : ( ( rule__IntegerVariable__Group_5__0 )? ) ;
    public final void rule__IntegerVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1373:1: ( ( ( rule__IntegerVariable__Group_5__0 )? ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1374:1: ( ( rule__IntegerVariable__Group_5__0 )? )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1374:1: ( ( rule__IntegerVariable__Group_5__0 )? )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1375:1: ( rule__IntegerVariable__Group_5__0 )?
            {
             before(grammarAccess.getIntegerVariableAccess().getGroup_5()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1376:1: ( rule__IntegerVariable__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1376:2: rule__IntegerVariable__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group_5__0_in_rule__IntegerVariable__Group__5__Impl2756);
                    rule__IntegerVariable__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerVariableAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__5__Impl"


    // $ANTLR start "rule__IntegerVariable__Group_5__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1398:1: rule__IntegerVariable__Group_5__0 : rule__IntegerVariable__Group_5__0__Impl rule__IntegerVariable__Group_5__1 ;
    public final void rule__IntegerVariable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1402:1: ( rule__IntegerVariable__Group_5__0__Impl rule__IntegerVariable__Group_5__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1403:2: rule__IntegerVariable__Group_5__0__Impl rule__IntegerVariable__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group_5__0__Impl_in_rule__IntegerVariable__Group_5__02799);
            rule__IntegerVariable__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group_5__1_in_rule__IntegerVariable__Group_5__02802);
            rule__IntegerVariable__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group_5__0"


    // $ANTLR start "rule__IntegerVariable__Group_5__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1410:1: rule__IntegerVariable__Group_5__0__Impl : ( ':=' ) ;
    public final void rule__IntegerVariable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1414:1: ( ( ':=' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1415:1: ( ':=' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1415:1: ( ':=' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1416:1: ':='
            {
             before(grammarAccess.getIntegerVariableAccess().getColonEqualsSignKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__IntegerVariable__Group_5__0__Impl2830); 
             after(grammarAccess.getIntegerVariableAccess().getColonEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group_5__0__Impl"


    // $ANTLR start "rule__IntegerVariable__Group_5__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1429:1: rule__IntegerVariable__Group_5__1 : rule__IntegerVariable__Group_5__1__Impl ;
    public final void rule__IntegerVariable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1433:1: ( rule__IntegerVariable__Group_5__1__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1434:2: rule__IntegerVariable__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__Group_5__1__Impl_in_rule__IntegerVariable__Group_5__12861);
            rule__IntegerVariable__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group_5__1"


    // $ANTLR start "rule__IntegerVariable__Group_5__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1440:1: rule__IntegerVariable__Group_5__1__Impl : ( ( rule__IntegerVariable__ValueAssignment_5_1 ) ) ;
    public final void rule__IntegerVariable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1444:1: ( ( ( rule__IntegerVariable__ValueAssignment_5_1 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1445:1: ( ( rule__IntegerVariable__ValueAssignment_5_1 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1445:1: ( ( rule__IntegerVariable__ValueAssignment_5_1 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1446:1: ( rule__IntegerVariable__ValueAssignment_5_1 )
            {
             before(grammarAccess.getIntegerVariableAccess().getValueAssignment_5_1()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1447:1: ( rule__IntegerVariable__ValueAssignment_5_1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1447:2: rule__IntegerVariable__ValueAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerVariable__ValueAssignment_5_1_in_rule__IntegerVariable__Group_5__1__Impl2888);
            rule__IntegerVariable__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerVariableAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group_5__1__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1461:1: rule__BooleanVariable__Group__0 : rule__BooleanVariable__Group__0__Impl rule__BooleanVariable__Group__1 ;
    public final void rule__BooleanVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1465:1: ( rule__BooleanVariable__Group__0__Impl rule__BooleanVariable__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1466:2: rule__BooleanVariable__Group__0__Impl rule__BooleanVariable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__0__Impl_in_rule__BooleanVariable__Group__02922);
            rule__BooleanVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__1_in_rule__BooleanVariable__Group__02925);
            rule__BooleanVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__0"


    // $ANTLR start "rule__BooleanVariable__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1473:1: rule__BooleanVariable__Group__0__Impl : ( () ) ;
    public final void rule__BooleanVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1477:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1478:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1478:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1479:1: ()
            {
             before(grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1480:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1482:1: 
            {
            }

             after(grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__0__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1492:1: rule__BooleanVariable__Group__1 : rule__BooleanVariable__Group__1__Impl rule__BooleanVariable__Group__2 ;
    public final void rule__BooleanVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1496:1: ( rule__BooleanVariable__Group__1__Impl rule__BooleanVariable__Group__2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1497:2: rule__BooleanVariable__Group__1__Impl rule__BooleanVariable__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__1__Impl_in_rule__BooleanVariable__Group__12983);
            rule__BooleanVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__2_in_rule__BooleanVariable__Group__12986);
            rule__BooleanVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__1"


    // $ANTLR start "rule__BooleanVariable__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1504:1: rule__BooleanVariable__Group__1__Impl : ( 'var' ) ;
    public final void rule__BooleanVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1508:1: ( ( 'var' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1509:1: ( 'var' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1509:1: ( 'var' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1510:1: 'var'
            {
             before(grammarAccess.getBooleanVariableAccess().getVarKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__BooleanVariable__Group__1__Impl3014); 
             after(grammarAccess.getBooleanVariableAccess().getVarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__1__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1523:1: rule__BooleanVariable__Group__2 : rule__BooleanVariable__Group__2__Impl rule__BooleanVariable__Group__3 ;
    public final void rule__BooleanVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1527:1: ( rule__BooleanVariable__Group__2__Impl rule__BooleanVariable__Group__3 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1528:2: rule__BooleanVariable__Group__2__Impl rule__BooleanVariable__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__2__Impl_in_rule__BooleanVariable__Group__23045);
            rule__BooleanVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__3_in_rule__BooleanVariable__Group__23048);
            rule__BooleanVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__2"


    // $ANTLR start "rule__BooleanVariable__Group__2__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1535:1: rule__BooleanVariable__Group__2__Impl : ( ( rule__BooleanVariable__NameAssignment_2 ) ) ;
    public final void rule__BooleanVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1539:1: ( ( ( rule__BooleanVariable__NameAssignment_2 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1540:1: ( ( rule__BooleanVariable__NameAssignment_2 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1540:1: ( ( rule__BooleanVariable__NameAssignment_2 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1541:1: ( rule__BooleanVariable__NameAssignment_2 )
            {
             before(grammarAccess.getBooleanVariableAccess().getNameAssignment_2()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1542:1: ( rule__BooleanVariable__NameAssignment_2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1542:2: rule__BooleanVariable__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__NameAssignment_2_in_rule__BooleanVariable__Group__2__Impl3075);
            rule__BooleanVariable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanVariableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__2__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__3"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1552:1: rule__BooleanVariable__Group__3 : rule__BooleanVariable__Group__3__Impl rule__BooleanVariable__Group__4 ;
    public final void rule__BooleanVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1556:1: ( rule__BooleanVariable__Group__3__Impl rule__BooleanVariable__Group__4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1557:2: rule__BooleanVariable__Group__3__Impl rule__BooleanVariable__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__3__Impl_in_rule__BooleanVariable__Group__33105);
            rule__BooleanVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__4_in_rule__BooleanVariable__Group__33108);
            rule__BooleanVariable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__3"


    // $ANTLR start "rule__BooleanVariable__Group__3__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1564:1: rule__BooleanVariable__Group__3__Impl : ( ':' ) ;
    public final void rule__BooleanVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1568:1: ( ( ':' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1569:1: ( ':' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1569:1: ( ':' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1570:1: ':'
            {
             before(grammarAccess.getBooleanVariableAccess().getColonKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__BooleanVariable__Group__3__Impl3136); 
             after(grammarAccess.getBooleanVariableAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__3__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1583:1: rule__BooleanVariable__Group__4 : rule__BooleanVariable__Group__4__Impl rule__BooleanVariable__Group__5 ;
    public final void rule__BooleanVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1587:1: ( rule__BooleanVariable__Group__4__Impl rule__BooleanVariable__Group__5 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1588:2: rule__BooleanVariable__Group__4__Impl rule__BooleanVariable__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__4__Impl_in_rule__BooleanVariable__Group__43167);
            rule__BooleanVariable__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__5_in_rule__BooleanVariable__Group__43170);
            rule__BooleanVariable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__4"


    // $ANTLR start "rule__BooleanVariable__Group__4__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1595:1: rule__BooleanVariable__Group__4__Impl : ( 'boolean' ) ;
    public final void rule__BooleanVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1599:1: ( ( 'boolean' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1600:1: ( 'boolean' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1600:1: ( 'boolean' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1601:1: 'boolean'
            {
             before(grammarAccess.getBooleanVariableAccess().getBooleanKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__BooleanVariable__Group__4__Impl3198); 
             after(grammarAccess.getBooleanVariableAccess().getBooleanKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__4__Impl"


    // $ANTLR start "rule__BooleanVariable__Group__5"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1614:1: rule__BooleanVariable__Group__5 : rule__BooleanVariable__Group__5__Impl ;
    public final void rule__BooleanVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1618:1: ( rule__BooleanVariable__Group__5__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1619:2: rule__BooleanVariable__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group__5__Impl_in_rule__BooleanVariable__Group__53229);
            rule__BooleanVariable__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__5"


    // $ANTLR start "rule__BooleanVariable__Group__5__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1625:1: rule__BooleanVariable__Group__5__Impl : ( ( rule__BooleanVariable__Group_5__0 )? ) ;
    public final void rule__BooleanVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1629:1: ( ( ( rule__BooleanVariable__Group_5__0 )? ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1630:1: ( ( rule__BooleanVariable__Group_5__0 )? )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1630:1: ( ( rule__BooleanVariable__Group_5__0 )? )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1631:1: ( rule__BooleanVariable__Group_5__0 )?
            {
             before(grammarAccess.getBooleanVariableAccess().getGroup_5()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1632:1: ( rule__BooleanVariable__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1632:2: rule__BooleanVariable__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group_5__0_in_rule__BooleanVariable__Group__5__Impl3256);
                    rule__BooleanVariable__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanVariableAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group__5__Impl"


    // $ANTLR start "rule__BooleanVariable__Group_5__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1654:1: rule__BooleanVariable__Group_5__0 : rule__BooleanVariable__Group_5__0__Impl rule__BooleanVariable__Group_5__1 ;
    public final void rule__BooleanVariable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1658:1: ( rule__BooleanVariable__Group_5__0__Impl rule__BooleanVariable__Group_5__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1659:2: rule__BooleanVariable__Group_5__0__Impl rule__BooleanVariable__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group_5__0__Impl_in_rule__BooleanVariable__Group_5__03299);
            rule__BooleanVariable__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group_5__1_in_rule__BooleanVariable__Group_5__03302);
            rule__BooleanVariable__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group_5__0"


    // $ANTLR start "rule__BooleanVariable__Group_5__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1666:1: rule__BooleanVariable__Group_5__0__Impl : ( ':=' ) ;
    public final void rule__BooleanVariable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1670:1: ( ( ':=' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1671:1: ( ':=' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1671:1: ( ':=' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1672:1: ':='
            {
             before(grammarAccess.getBooleanVariableAccess().getColonEqualsSignKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__BooleanVariable__Group_5__0__Impl3330); 
             after(grammarAccess.getBooleanVariableAccess().getColonEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group_5__0__Impl"


    // $ANTLR start "rule__BooleanVariable__Group_5__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1685:1: rule__BooleanVariable__Group_5__1 : rule__BooleanVariable__Group_5__1__Impl ;
    public final void rule__BooleanVariable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1689:1: ( rule__BooleanVariable__Group_5__1__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1690:2: rule__BooleanVariable__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__Group_5__1__Impl_in_rule__BooleanVariable__Group_5__13361);
            rule__BooleanVariable__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group_5__1"


    // $ANTLR start "rule__BooleanVariable__Group_5__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1696:1: rule__BooleanVariable__Group_5__1__Impl : ( ( rule__BooleanVariable__ValueAssignment_5_1 ) ) ;
    public final void rule__BooleanVariable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1700:1: ( ( ( rule__BooleanVariable__ValueAssignment_5_1 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1701:1: ( ( rule__BooleanVariable__ValueAssignment_5_1 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1701:1: ( ( rule__BooleanVariable__ValueAssignment_5_1 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1702:1: ( rule__BooleanVariable__ValueAssignment_5_1 )
            {
             before(grammarAccess.getBooleanVariableAccess().getValueAssignment_5_1()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1703:1: ( rule__BooleanVariable__ValueAssignment_5_1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1703:2: rule__BooleanVariable__ValueAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanVariable__ValueAssignment_5_1_in_rule__BooleanVariable__Group_5__1__Impl3388);
            rule__BooleanVariable__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanVariableAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__Group_5__1__Impl"


    // $ANTLR start "rule__IntegerData__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1717:1: rule__IntegerData__Group__0 : rule__IntegerData__Group__0__Impl rule__IntegerData__Group__1 ;
    public final void rule__IntegerData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1721:1: ( rule__IntegerData__Group__0__Impl rule__IntegerData__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1722:2: rule__IntegerData__Group__0__Impl rule__IntegerData__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerData__Group__0__Impl_in_rule__IntegerData__Group__03422);
            rule__IntegerData__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerData__Group__1_in_rule__IntegerData__Group__03425);
            rule__IntegerData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerData__Group__0"


    // $ANTLR start "rule__IntegerData__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1729:1: rule__IntegerData__Group__0__Impl : ( () ) ;
    public final void rule__IntegerData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1733:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1734:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1734:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1735:1: ()
            {
             before(grammarAccess.getIntegerDataAccess().getIntegerDataAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1736:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1738:1: 
            {
            }

             after(grammarAccess.getIntegerDataAccess().getIntegerDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerData__Group__0__Impl"


    // $ANTLR start "rule__IntegerData__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1748:1: rule__IntegerData__Group__1 : rule__IntegerData__Group__1__Impl ;
    public final void rule__IntegerData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1752:1: ( rule__IntegerData__Group__1__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1753:2: rule__IntegerData__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerData__Group__1__Impl_in_rule__IntegerData__Group__13483);
            rule__IntegerData__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerData__Group__1"


    // $ANTLR start "rule__IntegerData__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1759:1: rule__IntegerData__Group__1__Impl : ( ( rule__IntegerData__ValueAssignment_1 ) ) ;
    public final void rule__IntegerData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1763:1: ( ( ( rule__IntegerData__ValueAssignment_1 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1764:1: ( ( rule__IntegerData__ValueAssignment_1 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1764:1: ( ( rule__IntegerData__ValueAssignment_1 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1765:1: ( rule__IntegerData__ValueAssignment_1 )
            {
             before(grammarAccess.getIntegerDataAccess().getValueAssignment_1()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1766:1: ( rule__IntegerData__ValueAssignment_1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1766:2: rule__IntegerData__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerData__ValueAssignment_1_in_rule__IntegerData__Group__1__Impl3510);
            rule__IntegerData__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerDataAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerData__Group__1__Impl"


    // $ANTLR start "rule__BooleanData__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1780:1: rule__BooleanData__Group__0 : rule__BooleanData__Group__0__Impl rule__BooleanData__Group__1 ;
    public final void rule__BooleanData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1784:1: ( rule__BooleanData__Group__0__Impl rule__BooleanData__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1785:2: rule__BooleanData__Group__0__Impl rule__BooleanData__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanData__Group__0__Impl_in_rule__BooleanData__Group__03544);
            rule__BooleanData__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanData__Group__1_in_rule__BooleanData__Group__03547);
            rule__BooleanData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanData__Group__0"


    // $ANTLR start "rule__BooleanData__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1792:1: rule__BooleanData__Group__0__Impl : ( () ) ;
    public final void rule__BooleanData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1796:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1797:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1797:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1798:1: ()
            {
             before(grammarAccess.getBooleanDataAccess().getBooleanDataAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1799:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1801:1: 
            {
            }

             after(grammarAccess.getBooleanDataAccess().getBooleanDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanData__Group__0__Impl"


    // $ANTLR start "rule__BooleanData__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1811:1: rule__BooleanData__Group__1 : rule__BooleanData__Group__1__Impl ;
    public final void rule__BooleanData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1815:1: ( rule__BooleanData__Group__1__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1816:2: rule__BooleanData__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanData__Group__1__Impl_in_rule__BooleanData__Group__13605);
            rule__BooleanData__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanData__Group__1"


    // $ANTLR start "rule__BooleanData__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1822:1: rule__BooleanData__Group__1__Impl : ( ( rule__BooleanData__ValueAssignment_1 ) ) ;
    public final void rule__BooleanData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1826:1: ( ( ( rule__BooleanData__ValueAssignment_1 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1827:1: ( ( rule__BooleanData__ValueAssignment_1 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1827:1: ( ( rule__BooleanData__ValueAssignment_1 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1828:1: ( rule__BooleanData__ValueAssignment_1 )
            {
             before(grammarAccess.getBooleanDataAccess().getValueAssignment_1()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1829:1: ( rule__BooleanData__ValueAssignment_1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1829:2: rule__BooleanData__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanData__ValueAssignment_1_in_rule__BooleanData__Group__1__Impl3632);
            rule__BooleanData__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanDataAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanData__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1843:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1847:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1848:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03666);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03669);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1855:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1859:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1860:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1860:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1861:1: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1862:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1864:1: 
            {
            }

             after(grammarAccess.getEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1874:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1878:1: ( rule__Event__Group__1__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1879:2: rule__Event__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13727);
            rule__Event__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1885:1: rule__Event__Group__1__Impl : ( ( rule__Event__NameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1889:1: ( ( ( rule__Event__NameAssignment_1 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1890:1: ( ( rule__Event__NameAssignment_1 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1890:1: ( ( rule__Event__NameAssignment_1 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1891:1: ( rule__Event__NameAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_1()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1892:1: ( rule__Event__NameAssignment_1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1892:2: rule__Event__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl3754);
            rule__Event__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1906:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1910:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1911:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03788);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1_in_rule__State__Group__03791);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1918:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1922:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1923:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1923:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1924:1: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1925:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1927:1: 
            {
            }

             after(grammarAccess.getStateAccess().getStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1937:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1941:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1942:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13849);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2_in_rule__State__Group__13852);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1949:1: rule__State__Group__1__Impl : ( 'state' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1953:1: ( ( 'state' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1954:1: ( 'state' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1954:1: ( 'state' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1955:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__State__Group__1__Impl3880); 
             after(grammarAccess.getStateAccess().getStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1968:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1972:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1973:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23911);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3_in_rule__State__Group__23914);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1980:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1984:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1985:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1985:1: ( ( rule__State__NameAssignment_2 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1986:1: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1987:1: ( rule__State__NameAssignment_2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1987:2: rule__State__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl3941);
            rule__State__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:1997:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2001:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2002:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33971);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4_in_rule__State__Group__33974);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2009:1: rule__State__Group__3__Impl : ( '{' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2013:1: ( ( '{' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2014:1: ( '{' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2014:1: ( '{' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2015:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__State__Group__3__Impl4002); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2028:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2032:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2033:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__44033);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__State__Group__5_in_rule__State__Group__44036);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2040:1: rule__State__Group__4__Impl : ( ( rule__State__OperationAssignment_4 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2044:1: ( ( ( rule__State__OperationAssignment_4 )? ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2045:1: ( ( rule__State__OperationAssignment_4 )? )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2045:1: ( ( rule__State__OperationAssignment_4 )? )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2046:1: ( rule__State__OperationAssignment_4 )?
            {
             before(grammarAccess.getStateAccess().getOperationAssignment_4()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2047:1: ( rule__State__OperationAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2047:2: rule__State__OperationAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__State__OperationAssignment_4_in_rule__State__Group__4__Impl4063);
                    rule__State__OperationAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getOperationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2057:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2061:1: ( rule__State__Group__5__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2062:2: rule__State__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__54094);
            rule__State__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2068:1: rule__State__Group__5__Impl : ( '}' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2072:1: ( ( '}' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2073:1: ( '}' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2073:1: ( '}' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2074:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__State__Group__5__Impl4122); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__CompositeState__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2099:1: rule__CompositeState__Group__0 : rule__CompositeState__Group__0__Impl rule__CompositeState__Group__1 ;
    public final void rule__CompositeState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2103:1: ( rule__CompositeState__Group__0__Impl rule__CompositeState__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2104:2: rule__CompositeState__Group__0__Impl rule__CompositeState__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__0__Impl_in_rule__CompositeState__Group__04165);
            rule__CompositeState__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__1_in_rule__CompositeState__Group__04168);
            rule__CompositeState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__0"


    // $ANTLR start "rule__CompositeState__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2111:1: rule__CompositeState__Group__0__Impl : ( () ) ;
    public final void rule__CompositeState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2115:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2116:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2116:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2117:1: ()
            {
             before(grammarAccess.getCompositeStateAccess().getCompositeStateAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2118:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2120:1: 
            {
            }

             after(grammarAccess.getCompositeStateAccess().getCompositeStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__0__Impl"


    // $ANTLR start "rule__CompositeState__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2130:1: rule__CompositeState__Group__1 : rule__CompositeState__Group__1__Impl rule__CompositeState__Group__2 ;
    public final void rule__CompositeState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2134:1: ( rule__CompositeState__Group__1__Impl rule__CompositeState__Group__2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2135:2: rule__CompositeState__Group__1__Impl rule__CompositeState__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__1__Impl_in_rule__CompositeState__Group__14226);
            rule__CompositeState__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__2_in_rule__CompositeState__Group__14229);
            rule__CompositeState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__1"


    // $ANTLR start "rule__CompositeState__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2142:1: rule__CompositeState__Group__1__Impl : ( 'state' ) ;
    public final void rule__CompositeState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2146:1: ( ( 'state' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2147:1: ( 'state' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2147:1: ( 'state' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2148:1: 'state'
            {
             before(grammarAccess.getCompositeStateAccess().getStateKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__CompositeState__Group__1__Impl4257); 
             after(grammarAccess.getCompositeStateAccess().getStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__1__Impl"


    // $ANTLR start "rule__CompositeState__Group__2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2161:1: rule__CompositeState__Group__2 : rule__CompositeState__Group__2__Impl rule__CompositeState__Group__3 ;
    public final void rule__CompositeState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2165:1: ( rule__CompositeState__Group__2__Impl rule__CompositeState__Group__3 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2166:2: rule__CompositeState__Group__2__Impl rule__CompositeState__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__2__Impl_in_rule__CompositeState__Group__24288);
            rule__CompositeState__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__3_in_rule__CompositeState__Group__24291);
            rule__CompositeState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__2"


    // $ANTLR start "rule__CompositeState__Group__2__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2173:1: rule__CompositeState__Group__2__Impl : ( ( rule__CompositeState__NameAssignment_2 ) ) ;
    public final void rule__CompositeState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2177:1: ( ( ( rule__CompositeState__NameAssignment_2 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2178:1: ( ( rule__CompositeState__NameAssignment_2 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2178:1: ( ( rule__CompositeState__NameAssignment_2 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2179:1: ( rule__CompositeState__NameAssignment_2 )
            {
             before(grammarAccess.getCompositeStateAccess().getNameAssignment_2()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2180:1: ( rule__CompositeState__NameAssignment_2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2180:2: rule__CompositeState__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__NameAssignment_2_in_rule__CompositeState__Group__2__Impl4318);
            rule__CompositeState__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeStateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__2__Impl"


    // $ANTLR start "rule__CompositeState__Group__3"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2190:1: rule__CompositeState__Group__3 : rule__CompositeState__Group__3__Impl rule__CompositeState__Group__4 ;
    public final void rule__CompositeState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2194:1: ( rule__CompositeState__Group__3__Impl rule__CompositeState__Group__4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2195:2: rule__CompositeState__Group__3__Impl rule__CompositeState__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__3__Impl_in_rule__CompositeState__Group__34348);
            rule__CompositeState__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__4_in_rule__CompositeState__Group__34351);
            rule__CompositeState__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__3"


    // $ANTLR start "rule__CompositeState__Group__3__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2202:1: rule__CompositeState__Group__3__Impl : ( '{' ) ;
    public final void rule__CompositeState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2206:1: ( ( '{' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2207:1: ( '{' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2207:1: ( '{' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2208:1: '{'
            {
             before(grammarAccess.getCompositeStateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__CompositeState__Group__3__Impl4379); 
             after(grammarAccess.getCompositeStateAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__3__Impl"


    // $ANTLR start "rule__CompositeState__Group__4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2221:1: rule__CompositeState__Group__4 : rule__CompositeState__Group__4__Impl rule__CompositeState__Group__5 ;
    public final void rule__CompositeState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2225:1: ( rule__CompositeState__Group__4__Impl rule__CompositeState__Group__5 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2226:2: rule__CompositeState__Group__4__Impl rule__CompositeState__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__4__Impl_in_rule__CompositeState__Group__44410);
            rule__CompositeState__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__5_in_rule__CompositeState__Group__44413);
            rule__CompositeState__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__4"


    // $ANTLR start "rule__CompositeState__Group__4__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2233:1: rule__CompositeState__Group__4__Impl : ( ( rule__CompositeState__StatesAssignment_4 ) ) ;
    public final void rule__CompositeState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2237:1: ( ( ( rule__CompositeState__StatesAssignment_4 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2238:1: ( ( rule__CompositeState__StatesAssignment_4 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2238:1: ( ( rule__CompositeState__StatesAssignment_4 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2239:1: ( rule__CompositeState__StatesAssignment_4 )
            {
             before(grammarAccess.getCompositeStateAccess().getStatesAssignment_4()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2240:1: ( rule__CompositeState__StatesAssignment_4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2240:2: rule__CompositeState__StatesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__StatesAssignment_4_in_rule__CompositeState__Group__4__Impl4440);
            rule__CompositeState__StatesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCompositeStateAccess().getStatesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__4__Impl"


    // $ANTLR start "rule__CompositeState__Group__5"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2250:1: rule__CompositeState__Group__5 : rule__CompositeState__Group__5__Impl rule__CompositeState__Group__6 ;
    public final void rule__CompositeState__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2254:1: ( rule__CompositeState__Group__5__Impl rule__CompositeState__Group__6 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2255:2: rule__CompositeState__Group__5__Impl rule__CompositeState__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__5__Impl_in_rule__CompositeState__Group__54470);
            rule__CompositeState__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__6_in_rule__CompositeState__Group__54473);
            rule__CompositeState__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__5"


    // $ANTLR start "rule__CompositeState__Group__5__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2262:1: rule__CompositeState__Group__5__Impl : ( ( rule__CompositeState__StatesAssignment_5 )* ) ;
    public final void rule__CompositeState__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2266:1: ( ( ( rule__CompositeState__StatesAssignment_5 )* ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2267:1: ( ( rule__CompositeState__StatesAssignment_5 )* )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2267:1: ( ( rule__CompositeState__StatesAssignment_5 )* )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2268:1: ( rule__CompositeState__StatesAssignment_5 )*
            {
             before(grammarAccess.getCompositeStateAccess().getStatesAssignment_5()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2269:1: ( rule__CompositeState__StatesAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2269:2: rule__CompositeState__StatesAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CompositeState__StatesAssignment_5_in_rule__CompositeState__Group__5__Impl4500);
            	    rule__CompositeState__StatesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCompositeStateAccess().getStatesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__5__Impl"


    // $ANTLR start "rule__CompositeState__Group__6"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2279:1: rule__CompositeState__Group__6 : rule__CompositeState__Group__6__Impl rule__CompositeState__Group__7 ;
    public final void rule__CompositeState__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2283:1: ( rule__CompositeState__Group__6__Impl rule__CompositeState__Group__7 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2284:2: rule__CompositeState__Group__6__Impl rule__CompositeState__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__6__Impl_in_rule__CompositeState__Group__64531);
            rule__CompositeState__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__7_in_rule__CompositeState__Group__64534);
            rule__CompositeState__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__6"


    // $ANTLR start "rule__CompositeState__Group__6__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2291:1: rule__CompositeState__Group__6__Impl : ( ( rule__CompositeState__InitialStateAssignment_6 ) ) ;
    public final void rule__CompositeState__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2295:1: ( ( ( rule__CompositeState__InitialStateAssignment_6 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2296:1: ( ( rule__CompositeState__InitialStateAssignment_6 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2296:1: ( ( rule__CompositeState__InitialStateAssignment_6 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2297:1: ( rule__CompositeState__InitialStateAssignment_6 )
            {
             before(grammarAccess.getCompositeStateAccess().getInitialStateAssignment_6()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2298:1: ( rule__CompositeState__InitialStateAssignment_6 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2298:2: rule__CompositeState__InitialStateAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__InitialStateAssignment_6_in_rule__CompositeState__Group__6__Impl4561);
            rule__CompositeState__InitialStateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCompositeStateAccess().getInitialStateAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__6__Impl"


    // $ANTLR start "rule__CompositeState__Group__7"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2308:1: rule__CompositeState__Group__7 : rule__CompositeState__Group__7__Impl ;
    public final void rule__CompositeState__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2312:1: ( rule__CompositeState__Group__7__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2313:2: rule__CompositeState__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeState__Group__7__Impl_in_rule__CompositeState__Group__74591);
            rule__CompositeState__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__7"


    // $ANTLR start "rule__CompositeState__Group__7__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2319:1: rule__CompositeState__Group__7__Impl : ( '}' ) ;
    public final void rule__CompositeState__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2323:1: ( ( '}' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2324:1: ( '}' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2324:1: ( '}' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2325:1: '}'
            {
             before(grammarAccess.getCompositeStateAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__CompositeState__Group__7__Impl4619); 
             after(grammarAccess.getCompositeStateAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__Group__7__Impl"


    // $ANTLR start "rule__InitialState__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2354:1: rule__InitialState__Group__0 : rule__InitialState__Group__0__Impl rule__InitialState__Group__1 ;
    public final void rule__InitialState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2358:1: ( rule__InitialState__Group__0__Impl rule__InitialState__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2359:2: rule__InitialState__Group__0__Impl rule__InitialState__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__0__Impl_in_rule__InitialState__Group__04666);
            rule__InitialState__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__1_in_rule__InitialState__Group__04669);
            rule__InitialState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__0"


    // $ANTLR start "rule__InitialState__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2366:1: rule__InitialState__Group__0__Impl : ( () ) ;
    public final void rule__InitialState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2370:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2371:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2371:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2372:1: ()
            {
             before(grammarAccess.getInitialStateAccess().getInitialStateAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2373:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2375:1: 
            {
            }

             after(grammarAccess.getInitialStateAccess().getInitialStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__0__Impl"


    // $ANTLR start "rule__InitialState__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2385:1: rule__InitialState__Group__1 : rule__InitialState__Group__1__Impl rule__InitialState__Group__2 ;
    public final void rule__InitialState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2389:1: ( rule__InitialState__Group__1__Impl rule__InitialState__Group__2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2390:2: rule__InitialState__Group__1__Impl rule__InitialState__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__1__Impl_in_rule__InitialState__Group__14727);
            rule__InitialState__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__2_in_rule__InitialState__Group__14730);
            rule__InitialState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__1"


    // $ANTLR start "rule__InitialState__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2397:1: rule__InitialState__Group__1__Impl : ( 'init' ) ;
    public final void rule__InitialState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2401:1: ( ( 'init' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2402:1: ( 'init' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2402:1: ( 'init' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2403:1: 'init'
            {
             before(grammarAccess.getInitialStateAccess().getInitKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__InitialState__Group__1__Impl4758); 
             after(grammarAccess.getInitialStateAccess().getInitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__1__Impl"


    // $ANTLR start "rule__InitialState__Group__2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2416:1: rule__InitialState__Group__2 : rule__InitialState__Group__2__Impl rule__InitialState__Group__3 ;
    public final void rule__InitialState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2420:1: ( rule__InitialState__Group__2__Impl rule__InitialState__Group__3 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2421:2: rule__InitialState__Group__2__Impl rule__InitialState__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__2__Impl_in_rule__InitialState__Group__24789);
            rule__InitialState__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__3_in_rule__InitialState__Group__24792);
            rule__InitialState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__2"


    // $ANTLR start "rule__InitialState__Group__2__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2428:1: rule__InitialState__Group__2__Impl : ( 'with' ) ;
    public final void rule__InitialState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2432:1: ( ( 'with' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2433:1: ( 'with' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2433:1: ( 'with' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2434:1: 'with'
            {
             before(grammarAccess.getInitialStateAccess().getWithKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__InitialState__Group__2__Impl4820); 
             after(grammarAccess.getInitialStateAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__2__Impl"


    // $ANTLR start "rule__InitialState__Group__3"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2447:1: rule__InitialState__Group__3 : rule__InitialState__Group__3__Impl ;
    public final void rule__InitialState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2451:1: ( rule__InitialState__Group__3__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2452:2: rule__InitialState__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__Group__3__Impl_in_rule__InitialState__Group__34851);
            rule__InitialState__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__3"


    // $ANTLR start "rule__InitialState__Group__3__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2458:1: rule__InitialState__Group__3__Impl : ( ( rule__InitialState__ReferencedStateAssignment_3 ) ) ;
    public final void rule__InitialState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2462:1: ( ( ( rule__InitialState__ReferencedStateAssignment_3 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2463:1: ( ( rule__InitialState__ReferencedStateAssignment_3 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2463:1: ( ( rule__InitialState__ReferencedStateAssignment_3 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2464:1: ( rule__InitialState__ReferencedStateAssignment_3 )
            {
             before(grammarAccess.getInitialStateAccess().getReferencedStateAssignment_3()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2465:1: ( rule__InitialState__ReferencedStateAssignment_3 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2465:2: rule__InitialState__ReferencedStateAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InitialState__ReferencedStateAssignment_3_in_rule__InitialState__Group__3__Impl4878);
            rule__InitialState__ReferencedStateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitialStateAccess().getReferencedStateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2483:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2487:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2488:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__04916);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__04919);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2495:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2499:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2500:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2500:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2501:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2502:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2504:1: 
            {
            }

             after(grammarAccess.getOperationAccess().getOperationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2514:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2518:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2519:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__14977);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__14980);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2526:1: rule__Operation__Group__1__Impl : ( 'do' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2530:1: ( ( 'do' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2531:1: ( 'do' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2531:1: ( 'do' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2532:1: 'do'
            {
             before(grammarAccess.getOperationAccess().getDoKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Operation__Group__1__Impl5008); 
             after(grammarAccess.getOperationAccess().getDoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2545:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2549:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2550:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__25039);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__25042);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2557:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2561:1: ( ( '{' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2562:1: ( '{' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2562:1: ( '{' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2563:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Operation__Group__2__Impl5070); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2576:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2580:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2581:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__35101);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__35104);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2588:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__ContentsAssignment_3 ) ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2592:1: ( ( ( rule__Operation__ContentsAssignment_3 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2593:1: ( ( rule__Operation__ContentsAssignment_3 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2593:1: ( ( rule__Operation__ContentsAssignment_3 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2594:1: ( rule__Operation__ContentsAssignment_3 )
            {
             before(grammarAccess.getOperationAccess().getContentsAssignment_3()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2595:1: ( rule__Operation__ContentsAssignment_3 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2595:2: rule__Operation__ContentsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ContentsAssignment_3_in_rule__Operation__Group__3__Impl5131);
            rule__Operation__ContentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getContentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2605:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2609:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2610:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__45161);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__45164);
            rule__Operation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2617:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )* ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2621:1: ( ( ( rule__Operation__Group_4__0 )* ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2622:1: ( ( rule__Operation__Group_4__0 )* )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2622:1: ( ( rule__Operation__Group_4__0 )* )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2623:1: ( rule__Operation__Group_4__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2624:1: ( rule__Operation__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2624:2: rule__Operation__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl5191);
            	    rule__Operation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2634:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2638:1: ( rule__Operation__Group__5__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2639:2: rule__Operation__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__55222);
            rule__Operation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2645:1: rule__Operation__Group__5__Impl : ( '}' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2649:1: ( ( '}' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2650:1: ( '}' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2650:1: ( '}' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2651:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Operation__Group__5__Impl5250); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2676:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2680:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2681:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__05293);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__05296);
            rule__Operation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0"


    // $ANTLR start "rule__Operation__Group_4__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2688:1: rule__Operation__Group_4__0__Impl : ( ';' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2692:1: ( ( ';' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2693:1: ( ';' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2693:1: ( ';' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2694:1: ';'
            {
             before(grammarAccess.getOperationAccess().getSemicolonKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Operation__Group_4__0__Impl5324); 
             after(grammarAccess.getOperationAccess().getSemicolonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0__Impl"


    // $ANTLR start "rule__Operation__Group_4__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2707:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2711:1: ( rule__Operation__Group_4__1__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2712:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__15355);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1"


    // $ANTLR start "rule__Operation__Group_4__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2718:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__ContentsAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2722:1: ( ( ( rule__Operation__ContentsAssignment_4_1 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2723:1: ( ( rule__Operation__ContentsAssignment_4_1 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2723:1: ( ( rule__Operation__ContentsAssignment_4_1 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2724:1: ( rule__Operation__ContentsAssignment_4_1 )
            {
             before(grammarAccess.getOperationAccess().getContentsAssignment_4_1()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2725:1: ( rule__Operation__ContentsAssignment_4_1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2725:2: rule__Operation__ContentsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ContentsAssignment_4_1_in_rule__Operation__Group_4__1__Impl5382);
            rule__Operation__ContentsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getContentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1__Impl"


    // $ANTLR start "rule__BooleanAssignment__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2739:1: rule__BooleanAssignment__Group__0 : rule__BooleanAssignment__Group__0__Impl rule__BooleanAssignment__Group__1 ;
    public final void rule__BooleanAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2743:1: ( rule__BooleanAssignment__Group__0__Impl rule__BooleanAssignment__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2744:2: rule__BooleanAssignment__Group__0__Impl rule__BooleanAssignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment__Group__0__Impl_in_rule__BooleanAssignment__Group__05416);
            rule__BooleanAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment__Group__1_in_rule__BooleanAssignment__Group__05419);
            rule__BooleanAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__0"


    // $ANTLR start "rule__BooleanAssignment__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2751:1: rule__BooleanAssignment__Group__0__Impl : ( () ) ;
    public final void rule__BooleanAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2755:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2756:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2756:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2757:1: ()
            {
             before(grammarAccess.getBooleanAssignmentAccess().getAssignmentAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2758:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2760:1: 
            {
            }

             after(grammarAccess.getBooleanAssignmentAccess().getAssignmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__0__Impl"


    // $ANTLR start "rule__BooleanAssignment__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2770:1: rule__BooleanAssignment__Group__1 : rule__BooleanAssignment__Group__1__Impl rule__BooleanAssignment__Group__2 ;
    public final void rule__BooleanAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2774:1: ( rule__BooleanAssignment__Group__1__Impl rule__BooleanAssignment__Group__2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2775:2: rule__BooleanAssignment__Group__1__Impl rule__BooleanAssignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment__Group__1__Impl_in_rule__BooleanAssignment__Group__15477);
            rule__BooleanAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment__Group__2_in_rule__BooleanAssignment__Group__15480);
            rule__BooleanAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__1"


    // $ANTLR start "rule__BooleanAssignment__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2782:1: rule__BooleanAssignment__Group__1__Impl : ( ( rule__BooleanAssignment___nameAssignment_1 )? ) ;
    public final void rule__BooleanAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2786:1: ( ( ( rule__BooleanAssignment___nameAssignment_1 )? ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2787:1: ( ( rule__BooleanAssignment___nameAssignment_1 )? )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2787:1: ( ( rule__BooleanAssignment___nameAssignment_1 )? )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2788:1: ( rule__BooleanAssignment___nameAssignment_1 )?
            {
             before(grammarAccess.getBooleanAssignmentAccess().get_nameAssignment_1()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2789:1: ( rule__BooleanAssignment___nameAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2789:2: rule__BooleanAssignment___nameAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment___nameAssignment_1_in_rule__BooleanAssignment__Group__1__Impl5507);
                    rule__BooleanAssignment___nameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanAssignmentAccess().get_nameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__1__Impl"


    // $ANTLR start "rule__BooleanAssignment__Group__2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2799:1: rule__BooleanAssignment__Group__2 : rule__BooleanAssignment__Group__2__Impl rule__BooleanAssignment__Group__3 ;
    public final void rule__BooleanAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2803:1: ( rule__BooleanAssignment__Group__2__Impl rule__BooleanAssignment__Group__3 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2804:2: rule__BooleanAssignment__Group__2__Impl rule__BooleanAssignment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment__Group__2__Impl_in_rule__BooleanAssignment__Group__25538);
            rule__BooleanAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment__Group__3_in_rule__BooleanAssignment__Group__25541);
            rule__BooleanAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__2"


    // $ANTLR start "rule__BooleanAssignment__Group__2__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2811:1: rule__BooleanAssignment__Group__2__Impl : ( ( rule__BooleanAssignment__VariableAssignment_2 ) ) ;
    public final void rule__BooleanAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2815:1: ( ( ( rule__BooleanAssignment__VariableAssignment_2 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2816:1: ( ( rule__BooleanAssignment__VariableAssignment_2 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2816:1: ( ( rule__BooleanAssignment__VariableAssignment_2 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2817:1: ( rule__BooleanAssignment__VariableAssignment_2 )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getVariableAssignment_2()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2818:1: ( rule__BooleanAssignment__VariableAssignment_2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2818:2: rule__BooleanAssignment__VariableAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment__VariableAssignment_2_in_rule__BooleanAssignment__Group__2__Impl5568);
            rule__BooleanAssignment__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAssignmentAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__2__Impl"


    // $ANTLR start "rule__BooleanAssignment__Group__3"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2828:1: rule__BooleanAssignment__Group__3 : rule__BooleanAssignment__Group__3__Impl rule__BooleanAssignment__Group__4 ;
    public final void rule__BooleanAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2832:1: ( rule__BooleanAssignment__Group__3__Impl rule__BooleanAssignment__Group__4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2833:2: rule__BooleanAssignment__Group__3__Impl rule__BooleanAssignment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment__Group__3__Impl_in_rule__BooleanAssignment__Group__35598);
            rule__BooleanAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment__Group__4_in_rule__BooleanAssignment__Group__35601);
            rule__BooleanAssignment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__3"


    // $ANTLR start "rule__BooleanAssignment__Group__3__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2840:1: rule__BooleanAssignment__Group__3__Impl : ( ':=' ) ;
    public final void rule__BooleanAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2844:1: ( ( ':=' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2845:1: ( ':=' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2845:1: ( ':=' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2846:1: ':='
            {
             before(grammarAccess.getBooleanAssignmentAccess().getColonEqualsSignKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__BooleanAssignment__Group__3__Impl5629); 
             after(grammarAccess.getBooleanAssignmentAccess().getColonEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__3__Impl"


    // $ANTLR start "rule__BooleanAssignment__Group__4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2859:1: rule__BooleanAssignment__Group__4 : rule__BooleanAssignment__Group__4__Impl ;
    public final void rule__BooleanAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2863:1: ( rule__BooleanAssignment__Group__4__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2864:2: rule__BooleanAssignment__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment__Group__4__Impl_in_rule__BooleanAssignment__Group__45660);
            rule__BooleanAssignment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__4"


    // $ANTLR start "rule__BooleanAssignment__Group__4__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2870:1: rule__BooleanAssignment__Group__4__Impl : ( ( rule__BooleanAssignment__ExpressionAssignment_4 ) ) ;
    public final void rule__BooleanAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2874:1: ( ( ( rule__BooleanAssignment__ExpressionAssignment_4 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2875:1: ( ( rule__BooleanAssignment__ExpressionAssignment_4 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2875:1: ( ( rule__BooleanAssignment__ExpressionAssignment_4 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2876:1: ( rule__BooleanAssignment__ExpressionAssignment_4 )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getExpressionAssignment_4()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2877:1: ( rule__BooleanAssignment__ExpressionAssignment_4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2877:2: rule__BooleanAssignment__ExpressionAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanAssignment__ExpressionAssignment_4_in_rule__BooleanAssignment__Group__4__Impl5687);
            rule__BooleanAssignment__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAssignmentAccess().getExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__Group__4__Impl"


    // $ANTLR start "rule__IntegerAssignment__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2897:1: rule__IntegerAssignment__Group__0 : rule__IntegerAssignment__Group__0__Impl rule__IntegerAssignment__Group__1 ;
    public final void rule__IntegerAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2901:1: ( rule__IntegerAssignment__Group__0__Impl rule__IntegerAssignment__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2902:2: rule__IntegerAssignment__Group__0__Impl rule__IntegerAssignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment__Group__0__Impl_in_rule__IntegerAssignment__Group__05727);
            rule__IntegerAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment__Group__1_in_rule__IntegerAssignment__Group__05730);
            rule__IntegerAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__0"


    // $ANTLR start "rule__IntegerAssignment__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2909:1: rule__IntegerAssignment__Group__0__Impl : ( () ) ;
    public final void rule__IntegerAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2913:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2914:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2914:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2915:1: ()
            {
             before(grammarAccess.getIntegerAssignmentAccess().getAssignmentAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2916:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2918:1: 
            {
            }

             after(grammarAccess.getIntegerAssignmentAccess().getAssignmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__0__Impl"


    // $ANTLR start "rule__IntegerAssignment__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2928:1: rule__IntegerAssignment__Group__1 : rule__IntegerAssignment__Group__1__Impl rule__IntegerAssignment__Group__2 ;
    public final void rule__IntegerAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2932:1: ( rule__IntegerAssignment__Group__1__Impl rule__IntegerAssignment__Group__2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2933:2: rule__IntegerAssignment__Group__1__Impl rule__IntegerAssignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment__Group__1__Impl_in_rule__IntegerAssignment__Group__15788);
            rule__IntegerAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment__Group__2_in_rule__IntegerAssignment__Group__15791);
            rule__IntegerAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__1"


    // $ANTLR start "rule__IntegerAssignment__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2940:1: rule__IntegerAssignment__Group__1__Impl : ( ( rule__IntegerAssignment___nameAssignment_1 )? ) ;
    public final void rule__IntegerAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2944:1: ( ( ( rule__IntegerAssignment___nameAssignment_1 )? ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2945:1: ( ( rule__IntegerAssignment___nameAssignment_1 )? )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2945:1: ( ( rule__IntegerAssignment___nameAssignment_1 )? )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2946:1: ( rule__IntegerAssignment___nameAssignment_1 )?
            {
             before(grammarAccess.getIntegerAssignmentAccess().get_nameAssignment_1()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2947:1: ( rule__IntegerAssignment___nameAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2947:2: rule__IntegerAssignment___nameAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment___nameAssignment_1_in_rule__IntegerAssignment__Group__1__Impl5818);
                    rule__IntegerAssignment___nameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerAssignmentAccess().get_nameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__1__Impl"


    // $ANTLR start "rule__IntegerAssignment__Group__2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2957:1: rule__IntegerAssignment__Group__2 : rule__IntegerAssignment__Group__2__Impl rule__IntegerAssignment__Group__3 ;
    public final void rule__IntegerAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2961:1: ( rule__IntegerAssignment__Group__2__Impl rule__IntegerAssignment__Group__3 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2962:2: rule__IntegerAssignment__Group__2__Impl rule__IntegerAssignment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment__Group__2__Impl_in_rule__IntegerAssignment__Group__25849);
            rule__IntegerAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment__Group__3_in_rule__IntegerAssignment__Group__25852);
            rule__IntegerAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__2"


    // $ANTLR start "rule__IntegerAssignment__Group__2__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2969:1: rule__IntegerAssignment__Group__2__Impl : ( ( rule__IntegerAssignment__VariableAssignment_2 ) ) ;
    public final void rule__IntegerAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2973:1: ( ( ( rule__IntegerAssignment__VariableAssignment_2 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2974:1: ( ( rule__IntegerAssignment__VariableAssignment_2 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2974:1: ( ( rule__IntegerAssignment__VariableAssignment_2 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2975:1: ( rule__IntegerAssignment__VariableAssignment_2 )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getVariableAssignment_2()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2976:1: ( rule__IntegerAssignment__VariableAssignment_2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2976:2: rule__IntegerAssignment__VariableAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment__VariableAssignment_2_in_rule__IntegerAssignment__Group__2__Impl5879);
            rule__IntegerAssignment__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAssignmentAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__2__Impl"


    // $ANTLR start "rule__IntegerAssignment__Group__3"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2986:1: rule__IntegerAssignment__Group__3 : rule__IntegerAssignment__Group__3__Impl rule__IntegerAssignment__Group__4 ;
    public final void rule__IntegerAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2990:1: ( rule__IntegerAssignment__Group__3__Impl rule__IntegerAssignment__Group__4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2991:2: rule__IntegerAssignment__Group__3__Impl rule__IntegerAssignment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment__Group__3__Impl_in_rule__IntegerAssignment__Group__35909);
            rule__IntegerAssignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment__Group__4_in_rule__IntegerAssignment__Group__35912);
            rule__IntegerAssignment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__3"


    // $ANTLR start "rule__IntegerAssignment__Group__3__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:2998:1: rule__IntegerAssignment__Group__3__Impl : ( ':=' ) ;
    public final void rule__IntegerAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3002:1: ( ( ':=' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3003:1: ( ':=' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3003:1: ( ':=' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3004:1: ':='
            {
             before(grammarAccess.getIntegerAssignmentAccess().getColonEqualsSignKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__IntegerAssignment__Group__3__Impl5940); 
             after(grammarAccess.getIntegerAssignmentAccess().getColonEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__3__Impl"


    // $ANTLR start "rule__IntegerAssignment__Group__4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3017:1: rule__IntegerAssignment__Group__4 : rule__IntegerAssignment__Group__4__Impl ;
    public final void rule__IntegerAssignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3021:1: ( rule__IntegerAssignment__Group__4__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3022:2: rule__IntegerAssignment__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment__Group__4__Impl_in_rule__IntegerAssignment__Group__45971);
            rule__IntegerAssignment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__4"


    // $ANTLR start "rule__IntegerAssignment__Group__4__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3028:1: rule__IntegerAssignment__Group__4__Impl : ( ( rule__IntegerAssignment__ExpressionAssignment_4 ) ) ;
    public final void rule__IntegerAssignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3032:1: ( ( ( rule__IntegerAssignment__ExpressionAssignment_4 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3033:1: ( ( rule__IntegerAssignment__ExpressionAssignment_4 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3033:1: ( ( rule__IntegerAssignment__ExpressionAssignment_4 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3034:1: ( rule__IntegerAssignment__ExpressionAssignment_4 )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getExpressionAssignment_4()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3035:1: ( rule__IntegerAssignment__ExpressionAssignment_4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3035:2: rule__IntegerAssignment__ExpressionAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerAssignment__ExpressionAssignment_4_in_rule__IntegerAssignment__Group__4__Impl5998);
            rule__IntegerAssignment__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAssignmentAccess().getExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3055:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3059:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3060:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__06038);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__06041);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3067:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3071:1: ( ( () ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3072:1: ( () )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3072:1: ( () )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3073:1: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3074:1: ()
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3076:1: 
            {
            }

             after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3086:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3090:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3091:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__16099);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__16102);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3098:1: rule__Transition__Group__1__Impl : ( 'from' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3102:1: ( ( 'from' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3103:1: ( 'from' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3103:1: ( 'from' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3104:1: 'from'
            {
             before(grammarAccess.getTransitionAccess().getFromKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Transition__Group__1__Impl6130); 
             after(grammarAccess.getTransitionAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3117:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3121:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3122:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__26161);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__26164);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3129:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__SourceAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3133:1: ( ( ( rule__Transition__SourceAssignment_2 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3134:1: ( ( rule__Transition__SourceAssignment_2 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3134:1: ( ( rule__Transition__SourceAssignment_2 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3135:1: ( rule__Transition__SourceAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_2()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3136:1: ( rule__Transition__SourceAssignment_2 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3136:2: rule__Transition__SourceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__SourceAssignment_2_in_rule__Transition__Group__2__Impl6191);
            rule__Transition__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3146:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3150:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3151:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__36221);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__36224);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3158:1: rule__Transition__Group__3__Impl : ( 'to' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3162:1: ( ( 'to' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3163:1: ( 'to' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3163:1: ( 'to' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3164:1: 'to'
            {
             before(grammarAccess.getTransitionAccess().getToKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Transition__Group__3__Impl6252); 
             after(grammarAccess.getTransitionAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3177:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3181:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3182:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__46283);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__46286);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3189:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__TargetAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3193:1: ( ( ( rule__Transition__TargetAssignment_4 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3194:1: ( ( rule__Transition__TargetAssignment_4 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3194:1: ( ( rule__Transition__TargetAssignment_4 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3195:1: ( rule__Transition__TargetAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_4()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3196:1: ( rule__Transition__TargetAssignment_4 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3196:2: rule__Transition__TargetAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__TargetAssignment_4_in_rule__Transition__Group__4__Impl6313);
            rule__Transition__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3206:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3210:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3211:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__56343);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__56346);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3218:1: rule__Transition__Group__5__Impl : ( 'for' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3222:1: ( ( 'for' ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3223:1: ( 'for' )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3223:1: ( 'for' )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3224:1: 'for'
            {
             before(grammarAccess.getTransitionAccess().getForKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Transition__Group__5__Impl6374); 
             after(grammarAccess.getTransitionAccess().getForKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3237:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3241:1: ( rule__Transition__Group__6__Impl )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3242:2: rule__Transition__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__66405);
            rule__Transition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3248:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__EventAssignment_6 ) ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3252:1: ( ( ( rule__Transition__EventAssignment_6 ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3253:1: ( ( rule__Transition__EventAssignment_6 ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3253:1: ( ( rule__Transition__EventAssignment_6 ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3254:1: ( rule__Transition__EventAssignment_6 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_6()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3255:1: ( rule__Transition__EventAssignment_6 )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3255:2: rule__Transition__EventAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__EventAssignment_6_in_rule__Transition__Group__6__Impl6432);
            rule__Transition__EventAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__StateMachine__NameAssignment_2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3280:1: rule__StateMachine__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__StateMachine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3284:1: ( ( RULE_ID ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3285:1: ( RULE_ID )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3285:1: ( RULE_ID )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3286:1: RULE_ID
            {
             before(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__StateMachine__NameAssignment_26481); 
             after(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NameAssignment_2"


    // $ANTLR start "rule__StateMachine__VariablesAssignment_4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3295:1: rule__StateMachine__VariablesAssignment_4 : ( ruleVariable ) ;
    public final void rule__StateMachine__VariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3299:1: ( ( ruleVariable ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3300:1: ( ruleVariable )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3300:1: ( ruleVariable )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3301:1: ruleVariable
            {
             before(grammarAccess.getStateMachineAccess().getVariablesVariableParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__StateMachine__VariablesAssignment_46512);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getVariablesVariableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__VariablesAssignment_4"


    // $ANTLR start "rule__StateMachine__EventsAssignment_7"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3310:1: rule__StateMachine__EventsAssignment_7 : ( ruleEvent ) ;
    public final void rule__StateMachine__EventsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3314:1: ( ( ruleEvent ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3315:1: ( ruleEvent )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3315:1: ( ruleEvent )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3316:1: ruleEvent
            {
             before(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_76543);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__EventsAssignment_7"


    // $ANTLR start "rule__StateMachine__EventsAssignment_8_1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3325:1: rule__StateMachine__EventsAssignment_8_1 : ( ruleEvent ) ;
    public final void rule__StateMachine__EventsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3329:1: ( ( ruleEvent ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3330:1: ( ruleEvent )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3330:1: ( ruleEvent )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3331:1: ruleEvent
            {
             before(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_8_16574);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__EventsAssignment_8_1"


    // $ANTLR start "rule__StateMachine__StatesAssignment_10"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3340:1: rule__StateMachine__StatesAssignment_10 : ( ruleoneState ) ;
    public final void rule__StateMachine__StatesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3344:1: ( ( ruleoneState ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3345:1: ( ruleoneState )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3345:1: ( ruleoneState )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3346:1: ruleoneState
            {
             before(grammarAccess.getStateMachineAccess().getStatesOneStateParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleoneState_in_rule__StateMachine__StatesAssignment_106605);
            ruleoneState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStatesOneStateParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StatesAssignment_10"


    // $ANTLR start "rule__StateMachine__StatesAssignment_11"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3355:1: rule__StateMachine__StatesAssignment_11 : ( ruleoneState ) ;
    public final void rule__StateMachine__StatesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3359:1: ( ( ruleoneState ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3360:1: ( ruleoneState )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3360:1: ( ruleoneState )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3361:1: ruleoneState
            {
             before(grammarAccess.getStateMachineAccess().getStatesOneStateParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleoneState_in_rule__StateMachine__StatesAssignment_116636);
            ruleoneState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStatesOneStateParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StatesAssignment_11"


    // $ANTLR start "rule__StateMachine__InitialStateAssignment_12"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3370:1: rule__StateMachine__InitialStateAssignment_12 : ( ruleInitialState ) ;
    public final void rule__StateMachine__InitialStateAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3374:1: ( ( ruleInitialState ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3375:1: ( ruleInitialState )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3375:1: ( ruleInitialState )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3376:1: ruleInitialState
            {
             before(grammarAccess.getStateMachineAccess().getInitialStateInitialStateParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_rule__StateMachine__InitialStateAssignment_126667);
            ruleInitialState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getInitialStateInitialStateParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__InitialStateAssignment_12"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_13"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3385:1: rule__StateMachine__TransitionsAssignment_13 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3389:1: ( ( ruleTransition ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3390:1: ( ruleTransition )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3390:1: ( ruleTransition )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3391:1: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_13_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_136698);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_13"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_14"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3400:1: rule__StateMachine__TransitionsAssignment_14 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3404:1: ( ( ruleTransition ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3405:1: ( ruleTransition )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3405:1: ( ruleTransition )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3406:1: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_14_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_146729);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_14"


    // $ANTLR start "rule__IntegerVariable__NameAssignment_2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3415:1: rule__IntegerVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3419:1: ( ( RULE_ID ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3420:1: ( RULE_ID )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3420:1: ( RULE_ID )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3421:1: RULE_ID
            {
             before(grammarAccess.getIntegerVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__IntegerVariable__NameAssignment_26760); 
             after(grammarAccess.getIntegerVariableAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__NameAssignment_2"


    // $ANTLR start "rule__IntegerVariable__ValueAssignment_5_1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3430:1: rule__IntegerVariable__ValueAssignment_5_1 : ( ruleintegerData ) ;
    public final void rule__IntegerVariable__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3434:1: ( ( ruleintegerData ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3435:1: ( ruleintegerData )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3435:1: ( ruleintegerData )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3436:1: ruleintegerData
            {
             before(grammarAccess.getIntegerVariableAccess().getValueIntegerDataParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleintegerData_in_rule__IntegerVariable__ValueAssignment_5_16791);
            ruleintegerData();

            state._fsp--;

             after(grammarAccess.getIntegerVariableAccess().getValueIntegerDataParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__ValueAssignment_5_1"


    // $ANTLR start "rule__BooleanVariable__NameAssignment_2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3445:1: rule__BooleanVariable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BooleanVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3449:1: ( ( RULE_ID ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3450:1: ( RULE_ID )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3450:1: ( RULE_ID )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3451:1: RULE_ID
            {
             before(grammarAccess.getBooleanVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__BooleanVariable__NameAssignment_26822); 
             after(grammarAccess.getBooleanVariableAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__NameAssignment_2"


    // $ANTLR start "rule__BooleanVariable__ValueAssignment_5_1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3460:1: rule__BooleanVariable__ValueAssignment_5_1 : ( rulebooleanData ) ;
    public final void rule__BooleanVariable__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3464:1: ( ( rulebooleanData ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3465:1: ( rulebooleanData )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3465:1: ( rulebooleanData )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3466:1: rulebooleanData
            {
             before(grammarAccess.getBooleanVariableAccess().getValueBooleanDataParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleanData_in_rule__BooleanVariable__ValueAssignment_5_16853);
            rulebooleanData();

            state._fsp--;

             after(grammarAccess.getBooleanVariableAccess().getValueBooleanDataParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__ValueAssignment_5_1"


    // $ANTLR start "rule__IntegerData__ValueAssignment_1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3475:1: rule__IntegerData__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__IntegerData__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3479:1: ( ( RULE_INT ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3480:1: ( RULE_INT )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3480:1: ( RULE_INT )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3481:1: RULE_INT
            {
             before(grammarAccess.getIntegerDataAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__IntegerData__ValueAssignment_16884); 
             after(grammarAccess.getIntegerDataAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerData__ValueAssignment_1"


    // $ANTLR start "rule__BooleanData__ValueAssignment_1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3490:1: rule__BooleanData__ValueAssignment_1 : ( ruleBool ) ;
    public final void rule__BooleanData__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3494:1: ( ( ruleBool ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3495:1: ( ruleBool )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3495:1: ( ruleBool )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3496:1: ruleBool
            {
             before(grammarAccess.getBooleanDataAccess().getValueBoolParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBool_in_rule__BooleanData__ValueAssignment_16915);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getBooleanDataAccess().getValueBoolParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanData__ValueAssignment_1"


    // $ANTLR start "rule__Event__NameAssignment_1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3505:1: rule__Event__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Event__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3509:1: ( ( RULE_STRING ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3510:1: ( RULE_STRING )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3510:1: ( RULE_STRING )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3511:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Event__NameAssignment_16946); 
             after(grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_1"


    // $ANTLR start "rule__State__NameAssignment_2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3520:1: rule__State__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3524:1: ( ( RULE_ID ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3525:1: ( RULE_ID )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3525:1: ( RULE_ID )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3526:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__State__NameAssignment_26977); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_2"


    // $ANTLR start "rule__State__OperationAssignment_4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3535:1: rule__State__OperationAssignment_4 : ( ruleOperation ) ;
    public final void rule__State__OperationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3539:1: ( ( ruleOperation ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3540:1: ( ruleOperation )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3540:1: ( ruleOperation )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3541:1: ruleOperation
            {
             before(grammarAccess.getStateAccess().getOperationOperationParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__State__OperationAssignment_47008);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getStateAccess().getOperationOperationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OperationAssignment_4"


    // $ANTLR start "rule__CompositeState__NameAssignment_2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3550:1: rule__CompositeState__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CompositeState__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3554:1: ( ( RULE_ID ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3555:1: ( RULE_ID )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3555:1: ( RULE_ID )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3556:1: RULE_ID
            {
             before(grammarAccess.getCompositeStateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__CompositeState__NameAssignment_27039); 
             after(grammarAccess.getCompositeStateAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__NameAssignment_2"


    // $ANTLR start "rule__CompositeState__StatesAssignment_4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3565:1: rule__CompositeState__StatesAssignment_4 : ( ruleState ) ;
    public final void rule__CompositeState__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3569:1: ( ( ruleState ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3570:1: ( ruleState )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3570:1: ( ruleState )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3571:1: ruleState
            {
             before(grammarAccess.getCompositeStateAccess().getStatesStateParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_rule__CompositeState__StatesAssignment_47070);
            ruleState();

            state._fsp--;

             after(grammarAccess.getCompositeStateAccess().getStatesStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__StatesAssignment_4"


    // $ANTLR start "rule__CompositeState__StatesAssignment_5"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3580:1: rule__CompositeState__StatesAssignment_5 : ( ruleState ) ;
    public final void rule__CompositeState__StatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3584:1: ( ( ruleState ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3585:1: ( ruleState )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3585:1: ( ruleState )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3586:1: ruleState
            {
             before(grammarAccess.getCompositeStateAccess().getStatesStateParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_rule__CompositeState__StatesAssignment_57101);
            ruleState();

            state._fsp--;

             after(grammarAccess.getCompositeStateAccess().getStatesStateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__StatesAssignment_5"


    // $ANTLR start "rule__CompositeState__InitialStateAssignment_6"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3595:1: rule__CompositeState__InitialStateAssignment_6 : ( ruleInitialState ) ;
    public final void rule__CompositeState__InitialStateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3599:1: ( ( ruleInitialState ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3600:1: ( ruleInitialState )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3600:1: ( ruleInitialState )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3601:1: ruleInitialState
            {
             before(grammarAccess.getCompositeStateAccess().getInitialStateInitialStateParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_rule__CompositeState__InitialStateAssignment_67132);
            ruleInitialState();

            state._fsp--;

             after(grammarAccess.getCompositeStateAccess().getInitialStateInitialStateParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeState__InitialStateAssignment_6"


    // $ANTLR start "rule__InitialState__ReferencedStateAssignment_3"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3610:1: rule__InitialState__ReferencedStateAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InitialState__ReferencedStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3614:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3615:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3615:1: ( ( RULE_ID ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3616:1: ( RULE_ID )
            {
             before(grammarAccess.getInitialStateAccess().getReferencedStateStateCrossReference_3_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3617:1: ( RULE_ID )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3618:1: RULE_ID
            {
             before(grammarAccess.getInitialStateAccess().getReferencedStateStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__InitialState__ReferencedStateAssignment_37167); 
             after(grammarAccess.getInitialStateAccess().getReferencedStateStateIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInitialStateAccess().getReferencedStateStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__ReferencedStateAssignment_3"


    // $ANTLR start "rule__Operation__ContentsAssignment_3"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3629:1: rule__Operation__ContentsAssignment_3 : ( ruleAssignment ) ;
    public final void rule__Operation__ContentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3633:1: ( ( ruleAssignment ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3634:1: ( ruleAssignment )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3634:1: ( ruleAssignment )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3635:1: ruleAssignment
            {
             before(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Operation__ContentsAssignment_37202);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ContentsAssignment_3"


    // $ANTLR start "rule__Operation__ContentsAssignment_4_1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3644:1: rule__Operation__ContentsAssignment_4_1 : ( ruleAssignment ) ;
    public final void rule__Operation__ContentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3648:1: ( ( ruleAssignment ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3649:1: ( ruleAssignment )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3649:1: ( ruleAssignment )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3650:1: ruleAssignment
            {
             before(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Operation__ContentsAssignment_4_17233);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ContentsAssignment_4_1"


    // $ANTLR start "rule__BooleanAssignment___nameAssignment_1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3659:1: rule__BooleanAssignment___nameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BooleanAssignment___nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3663:1: ( ( RULE_STRING ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3664:1: ( RULE_STRING )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3664:1: ( RULE_STRING )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3665:1: RULE_STRING
            {
             before(grammarAccess.getBooleanAssignmentAccess().get_nameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__BooleanAssignment___nameAssignment_17264); 
             after(grammarAccess.getBooleanAssignmentAccess().get_nameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment___nameAssignment_1"


    // $ANTLR start "rule__BooleanAssignment__VariableAssignment_2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3674:1: rule__BooleanAssignment__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BooleanAssignment__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3678:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3679:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3679:1: ( ( RULE_ID ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3680:1: ( RULE_ID )
            {
             before(grammarAccess.getBooleanAssignmentAccess().getVariableBooleanVariableCrossReference_2_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3681:1: ( RULE_ID )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3682:1: RULE_ID
            {
             before(grammarAccess.getBooleanAssignmentAccess().getVariableBooleanVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__BooleanAssignment__VariableAssignment_27299); 
             after(grammarAccess.getBooleanAssignmentAccess().getVariableBooleanVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBooleanAssignmentAccess().getVariableBooleanVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__VariableAssignment_2"


    // $ANTLR start "rule__BooleanAssignment__ExpressionAssignment_4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3693:1: rule__BooleanAssignment__ExpressionAssignment_4 : ( rulebooleanData ) ;
    public final void rule__BooleanAssignment__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3697:1: ( ( rulebooleanData ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3698:1: ( rulebooleanData )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3698:1: ( rulebooleanData )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3699:1: rulebooleanData
            {
             before(grammarAccess.getBooleanAssignmentAccess().getExpressionBooleanDataParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleanData_in_rule__BooleanAssignment__ExpressionAssignment_47334);
            rulebooleanData();

            state._fsp--;

             after(grammarAccess.getBooleanAssignmentAccess().getExpressionBooleanDataParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanAssignment__ExpressionAssignment_4"


    // $ANTLR start "rule__IntegerAssignment___nameAssignment_1"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3708:1: rule__IntegerAssignment___nameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__IntegerAssignment___nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3712:1: ( ( RULE_STRING ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3713:1: ( RULE_STRING )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3713:1: ( RULE_STRING )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3714:1: RULE_STRING
            {
             before(grammarAccess.getIntegerAssignmentAccess().get_nameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__IntegerAssignment___nameAssignment_17365); 
             after(grammarAccess.getIntegerAssignmentAccess().get_nameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment___nameAssignment_1"


    // $ANTLR start "rule__IntegerAssignment__VariableAssignment_2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3723:1: rule__IntegerAssignment__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__IntegerAssignment__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3727:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3728:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3728:1: ( ( RULE_ID ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3729:1: ( RULE_ID )
            {
             before(grammarAccess.getIntegerAssignmentAccess().getVariableIntegerVariableCrossReference_2_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3730:1: ( RULE_ID )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3731:1: RULE_ID
            {
             before(grammarAccess.getIntegerAssignmentAccess().getVariableIntegerVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__IntegerAssignment__VariableAssignment_27400); 
             after(grammarAccess.getIntegerAssignmentAccess().getVariableIntegerVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getIntegerAssignmentAccess().getVariableIntegerVariableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__VariableAssignment_2"


    // $ANTLR start "rule__IntegerAssignment__ExpressionAssignment_4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3742:1: rule__IntegerAssignment__ExpressionAssignment_4 : ( ruleintegerData ) ;
    public final void rule__IntegerAssignment__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3746:1: ( ( ruleintegerData ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3747:1: ( ruleintegerData )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3747:1: ( ruleintegerData )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3748:1: ruleintegerData
            {
             before(grammarAccess.getIntegerAssignmentAccess().getExpressionIntegerDataParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleintegerData_in_rule__IntegerAssignment__ExpressionAssignment_47435);
            ruleintegerData();

            state._fsp--;

             after(grammarAccess.getIntegerAssignmentAccess().getExpressionIntegerDataParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerAssignment__ExpressionAssignment_4"


    // $ANTLR start "rule__Transition__SourceAssignment_2"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3757:1: rule__Transition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3761:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3762:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3762:1: ( ( RULE_ID ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3763:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3764:1: ( RULE_ID )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3765:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getSourceStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Transition__SourceAssignment_27470); 
             after(grammarAccess.getTransitionAccess().getSourceStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_2"


    // $ANTLR start "rule__Transition__TargetAssignment_4"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3776:1: rule__Transition__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3780:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3781:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3781:1: ( ( RULE_ID ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3782:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_4_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3783:1: ( RULE_ID )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3784:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_47509); 
             after(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_4"


    // $ANTLR start "rule__Transition__EventAssignment_6"
    // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3795:1: rule__Transition__EventAssignment_6 : ( ( RULE_STRING ) ) ;
    public final void rule__Transition__EventAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3799:1: ( ( ( RULE_STRING ) ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3800:1: ( ( RULE_STRING ) )
            {
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3800:1: ( ( RULE_STRING ) )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3801:1: ( RULE_STRING )
            {
             before(grammarAccess.getTransitionAccess().getEventEventCrossReference_6_0()); 
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3802:1: ( RULE_STRING )
            // ../org.xtext.idm.projet.ui/src-gen/org/xtext/idm/projet/ui/contentassist/antlr/internal/InternalStateMachine.g:3803:1: RULE_STRING
            {
             before(grammarAccess.getTransitionAccess().getEventEventSTRINGTerminalRuleCall_6_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Transition__EventAssignment_67548); 
             after(grammarAccess.getTransitionAccess().getEventEventSTRINGTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getEventEventCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_6"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Alternatives_in_ruleVariable154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleintegerVariable_in_entryRuleintegerVariable181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleintegerVariable188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__0_in_ruleintegerVariable214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleanVariable_in_entryRulebooleanVariable241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleanVariable248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__0_in_rulebooleanVariable274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleintegerData_in_entryRuleintegerData303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleintegerData310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerData__Group__0_in_ruleintegerData336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleanData_in_entryRulebooleanData363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleanData370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanData__Group__0_in_rulebooleanData396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBool_in_entryRuleBool423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBool430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bool__Alternatives_in_ruleBool456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvent490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoneState_in_entryRuleoneState543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoneState550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OneState__Alternatives_in_ruleoneState576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeState_in_entryRuleCompositeState663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeState670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__0_in_ruleCompositeState696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitialState_in_entryRuleInitialState723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitialState730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__Group__0_in_ruleInitialState756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Alternatives_in_ruleAssignment876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAssignment910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAssignment__Group__0_in_ruleBooleanAssignment936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerAssignment970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerAssignment__Group__0_in_ruleIntegerAssignment996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1023 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition1030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleintegerVariable_in_rule__Variable__Alternatives1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleanVariable_in_rule__Variable__Alternatives1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Bool__Alternatives1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Bool__Alternatives1163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_rule__OneState__Alternatives1197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeState_in_rule__OneState__Alternatives1214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanAssignment_in_rule__Assignment__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerAssignment_in_rule__Assignment__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__01293 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__01296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__11354 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__11357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__StateMachine__Group__1__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__21416 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__21419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__NameAssignment_2_in_rule__StateMachine__Group__2__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__31476 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__31479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__StateMachine__Group__3__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__41538 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__41541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__VariablesAssignment_4_in_rule__StateMachine__Group__4__Impl1568 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__51599 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__51602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__StateMachine__Group__5__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__61661 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__7_in_rule__StateMachine__Group__61664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__StateMachine__Group__6__Impl1692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__7__Impl_in_rule__StateMachine__Group__71723 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__8_in_rule__StateMachine__Group__71726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__EventsAssignment_7_in_rule__StateMachine__Group__7__Impl1753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__8__Impl_in_rule__StateMachine__Group__81783 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__9_in_rule__StateMachine__Group__81786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_8__0_in_rule__StateMachine__Group__8__Impl1813 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__9__Impl_in_rule__StateMachine__Group__91844 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__10_in_rule__StateMachine__Group__91847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__StateMachine__Group__9__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__10__Impl_in_rule__StateMachine__Group__101906 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__11_in_rule__StateMachine__Group__101909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__StatesAssignment_10_in_rule__StateMachine__Group__10__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__11__Impl_in_rule__StateMachine__Group__111966 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__12_in_rule__StateMachine__Group__111969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__StatesAssignment_11_in_rule__StateMachine__Group__11__Impl1996 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__12__Impl_in_rule__StateMachine__Group__122027 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__13_in_rule__StateMachine__Group__122030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__InitialStateAssignment_12_in_rule__StateMachine__Group__12__Impl2057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__13__Impl_in_rule__StateMachine__Group__132087 = new BitSet(new long[]{0x0000000010010000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__14_in_rule__StateMachine__Group__132090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__TransitionsAssignment_13_in_rule__StateMachine__Group__13__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__14__Impl_in_rule__StateMachine__Group__142147 = new BitSet(new long[]{0x0000000010010000L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__15_in_rule__StateMachine__Group__142150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__TransitionsAssignment_14_in_rule__StateMachine__Group__14__Impl2177 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group__15__Impl_in_rule__StateMachine__Group__152208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__StateMachine__Group__15__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_8__0__Impl_in_rule__StateMachine__Group_8__02299 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_8__1_in_rule__StateMachine__Group_8__02302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__StateMachine__Group_8__0__Impl2330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__Group_8__1__Impl_in_rule__StateMachine__Group_8__12361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StateMachine__EventsAssignment_8_1_in_rule__StateMachine__Group_8__1__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__0__Impl_in_rule__IntegerVariable__Group__02422 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__1_in_rule__IntegerVariable__Group__02425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__1__Impl_in_rule__IntegerVariable__Group__12483 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__2_in_rule__IntegerVariable__Group__12486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__IntegerVariable__Group__1__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__2__Impl_in_rule__IntegerVariable__Group__22545 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__3_in_rule__IntegerVariable__Group__22548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__NameAssignment_2_in_rule__IntegerVariable__Group__2__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__3__Impl_in_rule__IntegerVariable__Group__32605 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__4_in_rule__IntegerVariable__Group__32608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IntegerVariable__Group__3__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__4__Impl_in_rule__IntegerVariable__Group__42667 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__5_in_rule__IntegerVariable__Group__42670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__IntegerVariable__Group__4__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group__5__Impl_in_rule__IntegerVariable__Group__52729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group_5__0_in_rule__IntegerVariable__Group__5__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group_5__0__Impl_in_rule__IntegerVariable__Group_5__02799 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group_5__1_in_rule__IntegerVariable__Group_5__02802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__IntegerVariable__Group_5__0__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__Group_5__1__Impl_in_rule__IntegerVariable__Group_5__12861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerVariable__ValueAssignment_5_1_in_rule__IntegerVariable__Group_5__1__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__0__Impl_in_rule__BooleanVariable__Group__02922 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__1_in_rule__BooleanVariable__Group__02925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__1__Impl_in_rule__BooleanVariable__Group__12983 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__2_in_rule__BooleanVariable__Group__12986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BooleanVariable__Group__1__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__2__Impl_in_rule__BooleanVariable__Group__23045 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__3_in_rule__BooleanVariable__Group__23048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__NameAssignment_2_in_rule__BooleanVariable__Group__2__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__3__Impl_in_rule__BooleanVariable__Group__33105 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__4_in_rule__BooleanVariable__Group__33108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BooleanVariable__Group__3__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__4__Impl_in_rule__BooleanVariable__Group__43167 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__5_in_rule__BooleanVariable__Group__43170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__BooleanVariable__Group__4__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group__5__Impl_in_rule__BooleanVariable__Group__53229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group_5__0_in_rule__BooleanVariable__Group__5__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group_5__0__Impl_in_rule__BooleanVariable__Group_5__03299 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group_5__1_in_rule__BooleanVariable__Group_5__03302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__BooleanVariable__Group_5__0__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__Group_5__1__Impl_in_rule__BooleanVariable__Group_5__13361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanVariable__ValueAssignment_5_1_in_rule__BooleanVariable__Group_5__1__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerData__Group__0__Impl_in_rule__IntegerData__Group__03422 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__IntegerData__Group__1_in_rule__IntegerData__Group__03425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerData__Group__1__Impl_in_rule__IntegerData__Group__13483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerData__ValueAssignment_1_in_rule__IntegerData__Group__1__Impl3510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanData__Group__0__Impl_in_rule__BooleanData__Group__03544 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__BooleanData__Group__1_in_rule__BooleanData__Group__03547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanData__Group__1__Impl_in_rule__BooleanData__Group__13605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanData__ValueAssignment_1_in_rule__BooleanData__Group__1__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03666 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl3754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03788 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__03791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13849 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__13852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__State__Group__1__Impl3880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23911 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__23914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33971 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__33974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__State__Group__3__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__44033 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__44036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__OperationAssignment_4_in_rule__State__Group__4__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__54094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__State__Group__5__Impl4122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__0__Impl_in_rule__CompositeState__Group__04165 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__1_in_rule__CompositeState__Group__04168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__1__Impl_in_rule__CompositeState__Group__14226 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__2_in_rule__CompositeState__Group__14229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__CompositeState__Group__1__Impl4257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__2__Impl_in_rule__CompositeState__Group__24288 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__3_in_rule__CompositeState__Group__24291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState__NameAssignment_2_in_rule__CompositeState__Group__2__Impl4318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__3__Impl_in_rule__CompositeState__Group__34348 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__4_in_rule__CompositeState__Group__34351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__CompositeState__Group__3__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__4__Impl_in_rule__CompositeState__Group__44410 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__5_in_rule__CompositeState__Group__44413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState__StatesAssignment_4_in_rule__CompositeState__Group__4__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__5__Impl_in_rule__CompositeState__Group__54470 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__6_in_rule__CompositeState__Group__54473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState__StatesAssignment_5_in_rule__CompositeState__Group__5__Impl4500 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__6__Impl_in_rule__CompositeState__Group__64531 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__7_in_rule__CompositeState__Group__64534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState__InitialStateAssignment_6_in_rule__CompositeState__Group__6__Impl4561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeState__Group__7__Impl_in_rule__CompositeState__Group__74591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__CompositeState__Group__7__Impl4619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__Group__0__Impl_in_rule__InitialState__Group__04666 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__InitialState__Group__1_in_rule__InitialState__Group__04669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__Group__1__Impl_in_rule__InitialState__Group__14727 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__InitialState__Group__2_in_rule__InitialState__Group__14730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__InitialState__Group__1__Impl4758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__Group__2__Impl_in_rule__InitialState__Group__24789 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__InitialState__Group__3_in_rule__InitialState__Group__24792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__InitialState__Group__2__Impl4820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__Group__3__Impl_in_rule__InitialState__Group__34851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InitialState__ReferencedStateAssignment_3_in_rule__InitialState__Group__3__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__04916 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__04919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__14977 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__14980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Operation__Group__1__Impl5008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__25039 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__25042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Operation__Group__2__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__35101 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__35104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ContentsAssignment_3_in_rule__Operation__Group__3__Impl5131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__45161 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__45164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl5191 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__55222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Operation__Group__5__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__05293 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__05296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Operation__Group_4__0__Impl5324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__15355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ContentsAssignment_4_1_in_rule__Operation__Group_4__1__Impl5382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAssignment__Group__0__Impl_in_rule__BooleanAssignment__Group__05416 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__BooleanAssignment__Group__1_in_rule__BooleanAssignment__Group__05419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAssignment__Group__1__Impl_in_rule__BooleanAssignment__Group__15477 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__BooleanAssignment__Group__2_in_rule__BooleanAssignment__Group__15480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAssignment___nameAssignment_1_in_rule__BooleanAssignment__Group__1__Impl5507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAssignment__Group__2__Impl_in_rule__BooleanAssignment__Group__25538 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__BooleanAssignment__Group__3_in_rule__BooleanAssignment__Group__25541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAssignment__VariableAssignment_2_in_rule__BooleanAssignment__Group__2__Impl5568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAssignment__Group__3__Impl_in_rule__BooleanAssignment__Group__35598 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__BooleanAssignment__Group__4_in_rule__BooleanAssignment__Group__35601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__BooleanAssignment__Group__3__Impl5629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAssignment__Group__4__Impl_in_rule__BooleanAssignment__Group__45660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanAssignment__ExpressionAssignment_4_in_rule__BooleanAssignment__Group__4__Impl5687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerAssignment__Group__0__Impl_in_rule__IntegerAssignment__Group__05727 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__IntegerAssignment__Group__1_in_rule__IntegerAssignment__Group__05730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerAssignment__Group__1__Impl_in_rule__IntegerAssignment__Group__15788 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__IntegerAssignment__Group__2_in_rule__IntegerAssignment__Group__15791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerAssignment___nameAssignment_1_in_rule__IntegerAssignment__Group__1__Impl5818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerAssignment__Group__2__Impl_in_rule__IntegerAssignment__Group__25849 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__IntegerAssignment__Group__3_in_rule__IntegerAssignment__Group__25852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerAssignment__VariableAssignment_2_in_rule__IntegerAssignment__Group__2__Impl5879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerAssignment__Group__3__Impl_in_rule__IntegerAssignment__Group__35909 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__IntegerAssignment__Group__4_in_rule__IntegerAssignment__Group__35912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__IntegerAssignment__Group__3__Impl5940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerAssignment__Group__4__Impl_in_rule__IntegerAssignment__Group__45971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerAssignment__ExpressionAssignment_4_in_rule__IntegerAssignment__Group__4__Impl5998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__06038 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__06041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__16099 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__16102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Transition__Group__1__Impl6130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__26161 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__26164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__SourceAssignment_2_in_rule__Transition__Group__2__Impl6191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__36221 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__36224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Transition__Group__3__Impl6252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__46283 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__46286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__TargetAssignment_4_in_rule__Transition__Group__4__Impl6313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__56343 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__56346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Transition__Group__5__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__66405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__EventAssignment_6_in_rule__Transition__Group__6__Impl6432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__StateMachine__NameAssignment_26481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__StateMachine__VariablesAssignment_46512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_76543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_rule__StateMachine__EventsAssignment_8_16574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoneState_in_rule__StateMachine__StatesAssignment_106605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoneState_in_rule__StateMachine__StatesAssignment_116636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitialState_in_rule__StateMachine__InitialStateAssignment_126667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_136698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_146729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerVariable__NameAssignment_26760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleintegerData_in_rule__IntegerVariable__ValueAssignment_5_16791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanVariable__NameAssignment_26822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleanData_in_rule__BooleanVariable__ValueAssignment_5_16853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerData__ValueAssignment_16884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBool_in_rule__BooleanData__ValueAssignment_16915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Event__NameAssignment_16946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_26977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__State__OperationAssignment_47008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__CompositeState__NameAssignment_27039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_rule__CompositeState__StatesAssignment_47070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_rule__CompositeState__StatesAssignment_57101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitialState_in_rule__CompositeState__InitialStateAssignment_67132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__InitialState__ReferencedStateAssignment_37167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Operation__ContentsAssignment_37202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Operation__ContentsAssignment_4_17233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__BooleanAssignment___nameAssignment_17264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanAssignment__VariableAssignment_27299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleanData_in_rule__BooleanAssignment__ExpressionAssignment_47334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__IntegerAssignment___nameAssignment_17365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__IntegerAssignment__VariableAssignment_27400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleintegerData_in_rule__IntegerAssignment__ExpressionAssignment_47435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__SourceAssignment_27470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__TargetAssignment_47509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Transition__EventAssignment_67548 = new BitSet(new long[]{0x0000000000000002L});
    }


}