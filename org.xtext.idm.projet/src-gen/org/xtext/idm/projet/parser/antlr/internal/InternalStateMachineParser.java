package org.xtext.idm.projet.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.idm.projet.services.StateMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'events'", "','", "'}'", "'var'", "':'", "'integer'", "':='", "'boolean'", "'true'", "'false'", "'state'", "'init'", "'with'", "'do'", "';'", "'from'", "'to'", "'for'"
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
    public String getGrammarFileName() { return "../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g"; }



     	private StateMachineGrammarAccess grammarAccess;
     	
        public InternalStateMachineParser(TokenStream input, StateMachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";	
       	}
       	
       	@Override
       	protected StateMachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStateMachine"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:67:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:68:2: (iv_ruleStateMachine= ruleStateMachine EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:69:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_entryRuleStateMachine75);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMachine85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:76:1: ruleStateMachine returns [EObject current=null] : ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) ) )* otherlv_10= '}' ( (lv_states_11_0= ruleoneState ) ) ( (lv_states_12_0= ruleoneState ) )* ( (lv_initialState_13_0= ruleInitialState ) ) ( (lv_transitions_14_0= ruleTransition ) ) ( (lv_transitions_15_0= ruleTransition ) )* otherlv_16= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_16=null;
        EObject lv_variables_4_0 = null;

        EObject lv_events_7_0 = null;

        EObject lv_events_9_0 = null;

        EObject lv_states_11_0 = null;

        EObject lv_states_12_0 = null;

        EObject lv_initialState_13_0 = null;

        EObject lv_transitions_14_0 = null;

        EObject lv_transitions_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:79:28: ( ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) ) )* otherlv_10= '}' ( (lv_states_11_0= ruleoneState ) ) ( (lv_states_12_0= ruleoneState ) )* ( (lv_initialState_13_0= ruleInitialState ) ) ( (lv_transitions_14_0= ruleTransition ) ) ( (lv_transitions_15_0= ruleTransition ) )* otherlv_16= '}' ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:80:1: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) ) )* otherlv_10= '}' ( (lv_states_11_0= ruleoneState ) ) ( (lv_states_12_0= ruleoneState ) )* ( (lv_initialState_13_0= ruleInitialState ) ) ( (lv_transitions_14_0= ruleTransition ) ) ( (lv_transitions_15_0= ruleTransition ) )* otherlv_16= '}' )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:80:1: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) ) )* otherlv_10= '}' ( (lv_states_11_0= ruleoneState ) ) ( (lv_states_12_0= ruleoneState ) )* ( (lv_initialState_13_0= ruleInitialState ) ) ( (lv_transitions_14_0= ruleTransition ) ) ( (lv_transitions_15_0= ruleTransition ) )* otherlv_16= '}' )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:80:2: () otherlv_1= 'StateMachine' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* otherlv_5= 'events' otherlv_6= '{' ( (lv_events_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) ) )* otherlv_10= '}' ( (lv_states_11_0= ruleoneState ) ) ( (lv_states_12_0= ruleoneState ) )* ( (lv_initialState_13_0= ruleInitialState ) ) ( (lv_transitions_14_0= ruleTransition ) ) ( (lv_transitions_15_0= ruleTransition ) )* otherlv_16= '}'
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:80:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleStateMachine131); 

                	newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getStateMachineKeyword_1());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:90:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:91:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:91:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:92:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStateMachine148); 

            			newLeafNode(lv_name_2_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateMachineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine165); 

                	newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:112:1: ( (lv_variables_4_0= ruleVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:113:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:113:1: (lv_variables_4_0= ruleVariable )
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:114:3: lv_variables_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getVariablesVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleStateMachine186);
            	    lv_variables_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_4_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStateMachine199); 

                	newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getEventsKeyword_5());
                
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine211); 

                	newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:138:1: ( (lv_events_7_0= ruleEvent ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:139:1: (lv_events_7_0= ruleEvent )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:139:1: (lv_events_7_0= ruleEvent )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:140:3: lv_events_7_0= ruleEvent
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleStateMachine232);
            lv_events_7_0=ruleEvent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	        }
                   		add(
                   			current, 
                   			"events",
                    		lv_events_7_0, 
                    		"Event");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:156:2: (otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:156:4: otherlv_8= ',' ( (lv_events_9_0= ruleEvent ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStateMachine245); 

            	        	newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getCommaKeyword_8_0());
            	        
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:160:1: ( (lv_events_9_0= ruleEvent ) )
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:161:1: (lv_events_9_0= ruleEvent )
            	    {
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:161:1: (lv_events_9_0= ruleEvent )
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:162:3: lv_events_9_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEvent_in_ruleStateMachine266);
            	    lv_events_9_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_9_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine280); 

                	newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_9());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:182:1: ( (lv_states_11_0= ruleoneState ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:183:1: (lv_states_11_0= ruleoneState )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:183:1: (lv_states_11_0= ruleoneState )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:184:3: lv_states_11_0= ruleoneState
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getStatesOneStateParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoneState_in_ruleStateMachine301);
            lv_states_11_0=ruleoneState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	        }
                   		add(
                   			current, 
                   			"states",
                    		lv_states_11_0, 
                    		"oneState");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:200:2: ( (lv_states_12_0= ruleoneState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:201:1: (lv_states_12_0= ruleoneState )
            	    {
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:201:1: (lv_states_12_0= ruleoneState )
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:202:3: lv_states_12_0= ruleoneState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getStatesOneStateParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleoneState_in_ruleStateMachine322);
            	    lv_states_12_0=ruleoneState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_12_0, 
            	            		"oneState");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:218:3: ( (lv_initialState_13_0= ruleInitialState ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:219:1: (lv_initialState_13_0= ruleInitialState )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:219:1: (lv_initialState_13_0= ruleInitialState )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:220:3: lv_initialState_13_0= ruleInitialState
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getInitialStateInitialStateParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_ruleStateMachine344);
            lv_initialState_13_0=ruleInitialState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	        }
                   		set(
                   			current, 
                   			"initialState",
                    		lv_initialState_13_0, 
                    		"InitialState");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:236:2: ( (lv_transitions_14_0= ruleTransition ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:237:1: (lv_transitions_14_0= ruleTransition )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:237:1: (lv_transitions_14_0= ruleTransition )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:238:3: lv_transitions_14_0= ruleTransition
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_13_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStateMachine365);
            lv_transitions_14_0=ruleTransition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	        }
                   		add(
                   			current, 
                   			"transitions",
                    		lv_transitions_14_0, 
                    		"Transition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:254:2: ( (lv_transitions_15_0= ruleTransition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:255:1: (lv_transitions_15_0= ruleTransition )
            	    {
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:255:1: (lv_transitions_15_0= ruleTransition )
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:256:3: lv_transitions_15_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_14_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStateMachine386);
            	    lv_transitions_15_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_15_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine399); 

                	newLeafNode(otherlv_16, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_15());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:284:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:285:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:286:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable435);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:293:1: ruleVariable returns [EObject current=null] : (this_integerVariable_0= ruleintegerVariable | this_booleanVariable_1= rulebooleanVariable ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_integerVariable_0 = null;

        EObject this_booleanVariable_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:296:28: ( (this_integerVariable_0= ruleintegerVariable | this_booleanVariable_1= rulebooleanVariable ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:297:1: (this_integerVariable_0= ruleintegerVariable | this_booleanVariable_1= rulebooleanVariable )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:297:1: (this_integerVariable_0= ruleintegerVariable | this_booleanVariable_1= rulebooleanVariable )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==17) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==20) ) {
                            alt5=2;
                        }
                        else if ( (LA5_3==18) ) {
                            alt5=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:298:5: this_integerVariable_0= ruleintegerVariable
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleintegerVariable_in_ruleVariable492);
                    this_integerVariable_0=ruleintegerVariable();

                    state._fsp--;

                     
                            current = this_integerVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:308:5: this_booleanVariable_1= rulebooleanVariable
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulebooleanVariable_in_ruleVariable519);
                    this_booleanVariable_1=rulebooleanVariable();

                    state._fsp--;

                     
                            current = this_booleanVariable_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleintegerVariable"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:324:1: entryRuleintegerVariable returns [EObject current=null] : iv_ruleintegerVariable= ruleintegerVariable EOF ;
    public final EObject entryRuleintegerVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleintegerVariable = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:325:2: (iv_ruleintegerVariable= ruleintegerVariable EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:326:2: iv_ruleintegerVariable= ruleintegerVariable EOF
            {
             newCompositeNode(grammarAccess.getIntegerVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleintegerVariable_in_entryRuleintegerVariable554);
            iv_ruleintegerVariable=ruleintegerVariable();

            state._fsp--;

             current =iv_ruleintegerVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleintegerVariable564); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleintegerVariable"


    // $ANTLR start "ruleintegerVariable"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:333:1: ruleintegerVariable returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'integer' (otherlv_5= ':=' ( (lv_value_6_0= ruleintegerData ) ) )? ) ;
    public final EObject ruleintegerVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:336:28: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'integer' (otherlv_5= ':=' ( (lv_value_6_0= ruleintegerData ) ) )? ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:337:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'integer' (otherlv_5= ':=' ( (lv_value_6_0= ruleintegerData ) ) )? )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:337:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'integer' (otherlv_5= ':=' ( (lv_value_6_0= ruleintegerData ) ) )? )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:337:2: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'integer' (otherlv_5= ':=' ( (lv_value_6_0= ruleintegerData ) ) )?
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:337:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:338:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleintegerVariable610); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerVariableAccess().getVarKeyword_1());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:347:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:348:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:348:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:349:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleintegerVariable627); 

            			newLeafNode(lv_name_2_0, grammarAccess.getIntegerVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleintegerVariable644); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerVariableAccess().getColonKeyword_3());
                
            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleintegerVariable656); 

                	newLeafNode(otherlv_4, grammarAccess.getIntegerVariableAccess().getIntegerKeyword_4());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:373:1: (otherlv_5= ':=' ( (lv_value_6_0= ruleintegerData ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:373:3: otherlv_5= ':=' ( (lv_value_6_0= ruleintegerData ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleintegerVariable669); 

                        	newLeafNode(otherlv_5, grammarAccess.getIntegerVariableAccess().getColonEqualsSignKeyword_5_0());
                        
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:377:1: ( (lv_value_6_0= ruleintegerData ) )
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:378:1: (lv_value_6_0= ruleintegerData )
                    {
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:378:1: (lv_value_6_0= ruleintegerData )
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:379:3: lv_value_6_0= ruleintegerData
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerVariableAccess().getValueIntegerDataParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleintegerData_in_ruleintegerVariable690);
                    lv_value_6_0=ruleintegerData();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntegerVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"integerData");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleintegerVariable"


    // $ANTLR start "entryRulebooleanVariable"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:403:1: entryRulebooleanVariable returns [EObject current=null] : iv_rulebooleanVariable= rulebooleanVariable EOF ;
    public final EObject entryRulebooleanVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebooleanVariable = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:404:2: (iv_rulebooleanVariable= rulebooleanVariable EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:405:2: iv_rulebooleanVariable= rulebooleanVariable EOF
            {
             newCompositeNode(grammarAccess.getBooleanVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleanVariable_in_entryRulebooleanVariable728);
            iv_rulebooleanVariable=rulebooleanVariable();

            state._fsp--;

             current =iv_rulebooleanVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleanVariable738); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebooleanVariable"


    // $ANTLR start "rulebooleanVariable"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:412:1: rulebooleanVariable returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'boolean' (otherlv_5= ':=' ( (lv_value_6_0= rulebooleanData ) ) )? ) ;
    public final EObject rulebooleanVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:415:28: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'boolean' (otherlv_5= ':=' ( (lv_value_6_0= rulebooleanData ) ) )? ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:416:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'boolean' (otherlv_5= ':=' ( (lv_value_6_0= rulebooleanData ) ) )? )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:416:1: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'boolean' (otherlv_5= ':=' ( (lv_value_6_0= rulebooleanData ) ) )? )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:416:2: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'boolean' (otherlv_5= ':=' ( (lv_value_6_0= rulebooleanData ) ) )?
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:416:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:417:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulebooleanVariable784); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanVariableAccess().getVarKeyword_1());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:426:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:427:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:427:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:428:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulebooleanVariable801); 

            			newLeafNode(lv_name_2_0, grammarAccess.getBooleanVariableAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulebooleanVariable818); 

                	newLeafNode(otherlv_3, grammarAccess.getBooleanVariableAccess().getColonKeyword_3());
                
            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulebooleanVariable830); 

                	newLeafNode(otherlv_4, grammarAccess.getBooleanVariableAccess().getBooleanKeyword_4());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:452:1: (otherlv_5= ':=' ( (lv_value_6_0= rulebooleanData ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:452:3: otherlv_5= ':=' ( (lv_value_6_0= rulebooleanData ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulebooleanVariable843); 

                        	newLeafNode(otherlv_5, grammarAccess.getBooleanVariableAccess().getColonEqualsSignKeyword_5_0());
                        
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:456:1: ( (lv_value_6_0= rulebooleanData ) )
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:457:1: (lv_value_6_0= rulebooleanData )
                    {
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:457:1: (lv_value_6_0= rulebooleanData )
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:458:3: lv_value_6_0= rulebooleanData
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanVariableAccess().getValueBooleanDataParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulebooleanData_in_rulebooleanVariable864);
                    lv_value_6_0=rulebooleanData();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"booleanData");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebooleanVariable"


    // $ANTLR start "entryRuleintegerData"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:484:1: entryRuleintegerData returns [EObject current=null] : iv_ruleintegerData= ruleintegerData EOF ;
    public final EObject entryRuleintegerData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleintegerData = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:485:2: (iv_ruleintegerData= ruleintegerData EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:486:2: iv_ruleintegerData= ruleintegerData EOF
            {
             newCompositeNode(grammarAccess.getIntegerDataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleintegerData_in_entryRuleintegerData904);
            iv_ruleintegerData=ruleintegerData();

            state._fsp--;

             current =iv_ruleintegerData; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleintegerData914); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleintegerData"


    // $ANTLR start "ruleintegerData"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:493:1: ruleintegerData returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleintegerData() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:496:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:497:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:497:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:497:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:497:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:498:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntegerDataAccess().getIntegerDataAction_0(),
                        current);
                

            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:503:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:504:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:504:1: (lv_value_1_0= RULE_INT )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:505:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleintegerData965); 

            			newLeafNode(lv_value_1_0, grammarAccess.getIntegerDataAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleintegerData"


    // $ANTLR start "entryRulebooleanData"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:529:1: entryRulebooleanData returns [EObject current=null] : iv_rulebooleanData= rulebooleanData EOF ;
    public final EObject entryRulebooleanData() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebooleanData = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:530:2: (iv_rulebooleanData= rulebooleanData EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:531:2: iv_rulebooleanData= rulebooleanData EOF
            {
             newCompositeNode(grammarAccess.getBooleanDataRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleanData_in_entryRulebooleanData1006);
            iv_rulebooleanData=rulebooleanData();

            state._fsp--;

             current =iv_rulebooleanData; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleanData1016); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebooleanData"


    // $ANTLR start "rulebooleanData"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:538:1: rulebooleanData returns [EObject current=null] : ( () ( (lv_value_1_0= ruleBool ) ) ) ;
    public final EObject rulebooleanData() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:541:28: ( ( () ( (lv_value_1_0= ruleBool ) ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:542:1: ( () ( (lv_value_1_0= ruleBool ) ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:542:1: ( () ( (lv_value_1_0= ruleBool ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:542:2: () ( (lv_value_1_0= ruleBool ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:542:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:543:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanDataAccess().getBooleanDataAction_0(),
                        current);
                

            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:548:2: ( (lv_value_1_0= ruleBool ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:549:1: (lv_value_1_0= ruleBool )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:549:1: (lv_value_1_0= ruleBool )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:550:3: lv_value_1_0= ruleBool
            {
             
            	        newCompositeNode(grammarAccess.getBooleanDataAccess().getValueBoolParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBool_in_rulebooleanData1071);
            lv_value_1_0=ruleBool();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanDataRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Bool");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebooleanData"


    // $ANTLR start "entryRuleBool"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:574:1: entryRuleBool returns [String current=null] : iv_ruleBool= ruleBool EOF ;
    public final String entryRuleBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBool = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:575:2: (iv_ruleBool= ruleBool EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:576:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBool_in_entryRuleBool1108);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBool1119); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:583:1: ruleBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:586:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:587:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:587:1: (kw= 'true' | kw= 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:588:2: kw= 'true'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBool1157); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:595:2: kw= 'false'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBool1176); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBoolAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleEvent"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:608:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:609:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:610:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEvent_in_entryRuleEvent1216);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEvent1226); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:617:1: ruleEvent returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:620:28: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:621:1: ( () ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:621:1: ( () ( (lv_name_1_0= RULE_STRING ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:621:2: () ( (lv_name_1_0= RULE_STRING ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:621:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:622:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:627:2: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:628:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:628:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:629:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEvent1277); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleoneState"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:653:1: entryRuleoneState returns [EObject current=null] : iv_ruleoneState= ruleoneState EOF ;
    public final EObject entryRuleoneState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoneState = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:654:2: (iv_ruleoneState= ruleoneState EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:655:2: iv_ruleoneState= ruleoneState EOF
            {
             newCompositeNode(grammarAccess.getOneStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoneState_in_entryRuleoneState1318);
            iv_ruleoneState=ruleoneState();

            state._fsp--;

             current =iv_ruleoneState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoneState1328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoneState"


    // $ANTLR start "ruleoneState"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:662:1: ruleoneState returns [EObject current=null] : (this_State_0= ruleState | this_CompositeState_1= ruleCompositeState ) ;
    public final EObject ruleoneState() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_CompositeState_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:665:28: ( (this_State_0= ruleState | this_CompositeState_1= ruleCompositeState ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:666:1: (this_State_0= ruleState | this_CompositeState_1= ruleCompositeState )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:666:1: (this_State_0= ruleState | this_CompositeState_1= ruleCompositeState )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==12) ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3==23) ) {
                            alt9=2;
                        }
                        else if ( (LA9_3==15||LA9_3==26) ) {
                            alt9=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:667:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getOneStateAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleoneState1375);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:677:5: this_CompositeState_1= ruleCompositeState
                    {
                     
                            newCompositeNode(grammarAccess.getOneStateAccess().getCompositeStateParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeState_in_ruleoneState1402);
                    this_CompositeState_1=ruleCompositeState();

                    state._fsp--;

                     
                            current = this_CompositeState_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoneState"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:693:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:694:2: (iv_ruleState= ruleState EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:695:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1437);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1447); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:702:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_operation_4_0= ruleOperation ) )? otherlv_5= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operation_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:705:28: ( ( () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_operation_4_0= ruleOperation ) )? otherlv_5= '}' ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:706:1: ( () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_operation_4_0= ruleOperation ) )? otherlv_5= '}' )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:706:1: ( () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_operation_4_0= ruleOperation ) )? otherlv_5= '}' )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:706:2: () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_operation_4_0= ruleOperation ) )? otherlv_5= '}'
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:706:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:707:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleState1493); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:716:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:717:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:717:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:718:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState1510); 

            			newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleState1527); 

                	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:738:1: ( (lv_operation_4_0= ruleOperation ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:739:1: (lv_operation_4_0= ruleOperation )
                    {
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:739:1: (lv_operation_4_0= ruleOperation )
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:740:3: lv_operation_4_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getOperationOperationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleState1548);
                    lv_operation_4_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		set(
                           			current, 
                           			"operation",
                            		lv_operation_4_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState1561); 

                	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleCompositeState"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:768:1: entryRuleCompositeState returns [EObject current=null] : iv_ruleCompositeState= ruleCompositeState EOF ;
    public final EObject entryRuleCompositeState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeState = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:769:2: (iv_ruleCompositeState= ruleCompositeState EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:770:2: iv_ruleCompositeState= ruleCompositeState EOF
            {
             newCompositeNode(grammarAccess.getCompositeStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositeState_in_entryRuleCompositeState1597);
            iv_ruleCompositeState=ruleCompositeState();

            state._fsp--;

             current =iv_ruleCompositeState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeState1607); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeState"


    // $ANTLR start "ruleCompositeState"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:777:1: ruleCompositeState returns [EObject current=null] : ( () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* ( (lv_initialState_6_0= ruleInitialState ) ) otherlv_7= '}' ) ;
    public final EObject ruleCompositeState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_states_4_0 = null;

        EObject lv_states_5_0 = null;

        EObject lv_initialState_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:780:28: ( ( () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* ( (lv_initialState_6_0= ruleInitialState ) ) otherlv_7= '}' ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:781:1: ( () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* ( (lv_initialState_6_0= ruleInitialState ) ) otherlv_7= '}' )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:781:1: ( () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* ( (lv_initialState_6_0= ruleInitialState ) ) otherlv_7= '}' )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:781:2: () otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_states_4_0= ruleState ) ) ( (lv_states_5_0= ruleState ) )* ( (lv_initialState_6_0= ruleInitialState ) ) otherlv_7= '}'
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:781:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:782:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCompositeStateAccess().getCompositeStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCompositeState1653); 

                	newLeafNode(otherlv_1, grammarAccess.getCompositeStateAccess().getStateKeyword_1());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:791:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:792:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:792:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:793:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompositeState1670); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCompositeStateAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompositeStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCompositeState1687); 

                	newLeafNode(otherlv_3, grammarAccess.getCompositeStateAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:813:1: ( (lv_states_4_0= ruleState ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:814:1: (lv_states_4_0= ruleState )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:814:1: (lv_states_4_0= ruleState )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:815:3: lv_states_4_0= ruleState
            {
             
            	        newCompositeNode(grammarAccess.getCompositeStateAccess().getStatesStateParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleCompositeState1708);
            lv_states_4_0=ruleState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	        }
                   		add(
                   			current, 
                   			"states",
                    		lv_states_4_0, 
                    		"State");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:831:2: ( (lv_states_5_0= ruleState ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:832:1: (lv_states_5_0= ruleState )
            	    {
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:832:1: (lv_states_5_0= ruleState )
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:833:3: lv_states_5_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCompositeStateAccess().getStatesStateParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleCompositeState1729);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_5_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:849:3: ( (lv_initialState_6_0= ruleInitialState ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:850:1: (lv_initialState_6_0= ruleInitialState )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:850:1: (lv_initialState_6_0= ruleInitialState )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:851:3: lv_initialState_6_0= ruleInitialState
            {
             
            	        newCompositeNode(grammarAccess.getCompositeStateAccess().getInitialStateInitialStateParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_ruleCompositeState1751);
            lv_initialState_6_0=ruleInitialState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeStateRule());
            	        }
                   		set(
                   			current, 
                   			"initialState",
                    		lv_initialState_6_0, 
                    		"InitialState");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCompositeState1763); 

                	newLeafNode(otherlv_7, grammarAccess.getCompositeStateAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeState"


    // $ANTLR start "entryRuleInitialState"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:879:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:880:2: (iv_ruleInitialState= ruleInitialState EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:881:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInitialState_in_entryRuleInitialState1799);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitialState1809); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:888:1: ruleInitialState returns [EObject current=null] : ( () otherlv_1= 'init' otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:891:28: ( ( () otherlv_1= 'init' otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:892:1: ( () otherlv_1= 'init' otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:892:1: ( () otherlv_1= 'init' otherlv_2= 'with' ( (otherlv_3= RULE_ID ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:892:2: () otherlv_1= 'init' otherlv_2= 'with' ( (otherlv_3= RULE_ID ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:892:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:893:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInitialStateAccess().getInitialStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInitialState1855); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialStateAccess().getInitKeyword_1());
                
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInitialState1867); 

                	newLeafNode(otherlv_2, grammarAccess.getInitialStateAccess().getWithKeyword_2());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:906:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:907:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:907:1: (otherlv_3= RULE_ID )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:908:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialStateRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInitialState1887); 

            		newLeafNode(otherlv_3, grammarAccess.getInitialStateAccess().getReferencedStateStateCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:927:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:928:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:929:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation1923);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation1933); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:936:1: ruleOperation returns [EObject current=null] : ( () otherlv_1= 'do' otherlv_2= '{' ( (lv_contents_3_0= ruleAssignment ) ) (otherlv_4= ';' ( (lv_contents_5_0= ruleAssignment ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_contents_3_0 = null;

        EObject lv_contents_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:939:28: ( ( () otherlv_1= 'do' otherlv_2= '{' ( (lv_contents_3_0= ruleAssignment ) ) (otherlv_4= ';' ( (lv_contents_5_0= ruleAssignment ) ) )* otherlv_6= '}' ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:940:1: ( () otherlv_1= 'do' otherlv_2= '{' ( (lv_contents_3_0= ruleAssignment ) ) (otherlv_4= ';' ( (lv_contents_5_0= ruleAssignment ) ) )* otherlv_6= '}' )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:940:1: ( () otherlv_1= 'do' otherlv_2= '{' ( (lv_contents_3_0= ruleAssignment ) ) (otherlv_4= ';' ( (lv_contents_5_0= ruleAssignment ) ) )* otherlv_6= '}' )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:940:2: () otherlv_1= 'do' otherlv_2= '{' ( (lv_contents_3_0= ruleAssignment ) ) (otherlv_4= ';' ( (lv_contents_5_0= ruleAssignment ) ) )* otherlv_6= '}'
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:940:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:941:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperationAccess().getOperationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleOperation1979); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getDoKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOperation1991); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:954:1: ( (lv_contents_3_0= ruleAssignment ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:955:1: (lv_contents_3_0= ruleAssignment )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:955:1: (lv_contents_3_0= ruleAssignment )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:956:3: lv_contents_3_0= ruleAssignment
            {
             
            	        newCompositeNode(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleOperation2012);
            lv_contents_3_0=ruleAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	        }
                   		add(
                   			current, 
                   			"contents",
                    		lv_contents_3_0, 
                    		"Assignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:972:2: (otherlv_4= ';' ( (lv_contents_5_0= ruleAssignment ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:972:4: otherlv_4= ';' ( (lv_contents_5_0= ruleAssignment ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleOperation2025); 

            	        	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getSemicolonKeyword_4_0());
            	        
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:976:1: ( (lv_contents_5_0= ruleAssignment ) )
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:977:1: (lv_contents_5_0= ruleAssignment )
            	    {
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:977:1: (lv_contents_5_0= ruleAssignment )
            	    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:978:3: lv_contents_5_0= ruleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOperationAccess().getContentsAssignmentParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleOperation2046);
            	    lv_contents_5_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contents",
            	            		lv_contents_5_0, 
            	            		"Assignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOperation2060); 

                	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleAssignment"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1006:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1007:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1008:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment2096);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment2106); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1015:1: ruleAssignment returns [EObject current=null] : (this_BooleanAssignment_0= ruleBooleanAssignment | this_IntegerAssignment_1= ruleIntegerAssignment ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanAssignment_0 = null;

        EObject this_IntegerAssignment_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1018:28: ( (this_BooleanAssignment_0= ruleBooleanAssignment | this_IntegerAssignment_1= ruleIntegerAssignment ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1019:1: (this_BooleanAssignment_0= ruleBooleanAssignment | this_IntegerAssignment_1= ruleIntegerAssignment )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1019:1: (this_BooleanAssignment_0= ruleBooleanAssignment | this_IntegerAssignment_1= ruleIntegerAssignment )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==19) ) {
                        int LA13_3 = input.LA(4);

                        if ( ((LA13_3>=21 && LA13_3<=22)) ) {
                            alt13=1;
                        }
                        else if ( (LA13_3==RULE_INT) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_ID) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==19) ) {
                    int LA13_3 = input.LA(3);

                    if ( ((LA13_3>=21 && LA13_3<=22)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_3==RULE_INT) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1020:5: this_BooleanAssignment_0= ruleBooleanAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentAccess().getBooleanAssignmentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanAssignment_in_ruleAssignment2153);
                    this_BooleanAssignment_0=ruleBooleanAssignment();

                    state._fsp--;

                     
                            current = this_BooleanAssignment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1030:5: this_IntegerAssignment_1= ruleIntegerAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getAssignmentAccess().getIntegerAssignmentParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerAssignment_in_ruleAssignment2180);
                    this_IntegerAssignment_1=ruleIntegerAssignment();

                    state._fsp--;

                     
                            current = this_IntegerAssignment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleBooleanAssignment"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1046:1: entryRuleBooleanAssignment returns [EObject current=null] : iv_ruleBooleanAssignment= ruleBooleanAssignment EOF ;
    public final EObject entryRuleBooleanAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAssignment = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1047:2: (iv_ruleBooleanAssignment= ruleBooleanAssignment EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1048:2: iv_ruleBooleanAssignment= ruleBooleanAssignment EOF
            {
             newCompositeNode(grammarAccess.getBooleanAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment2215);
            iv_ruleBooleanAssignment=ruleBooleanAssignment();

            state._fsp--;

             current =iv_ruleBooleanAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanAssignment2225); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanAssignment"


    // $ANTLR start "ruleBooleanAssignment"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1055:1: ruleBooleanAssignment returns [EObject current=null] : ( () ( (lv__name_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_expression_4_0= rulebooleanData ) ) ) ;
    public final EObject ruleBooleanAssignment() throws RecognitionException {
        EObject current = null;

        Token lv__name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1058:28: ( ( () ( (lv__name_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_expression_4_0= rulebooleanData ) ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1059:1: ( () ( (lv__name_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_expression_4_0= rulebooleanData ) ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1059:1: ( () ( (lv__name_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_expression_4_0= rulebooleanData ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1059:2: () ( (lv__name_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_expression_4_0= rulebooleanData ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1059:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1060:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanAssignmentAccess().getAssignmentAction_0(),
                        current);
                

            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1065:2: ( (lv__name_1_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1066:1: (lv__name_1_0= RULE_STRING )
                    {
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1066:1: (lv__name_1_0= RULE_STRING )
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1067:3: lv__name_1_0= RULE_STRING
                    {
                    lv__name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleBooleanAssignment2276); 

                    			newLeafNode(lv__name_1_0, grammarAccess.getBooleanAssignmentAccess().get_nameSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanAssignmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"_name",
                            		lv__name_1_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1083:3: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1084:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1084:1: (otherlv_2= RULE_ID )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1085:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanAssignmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBooleanAssignment2302); 

            		newLeafNode(otherlv_2, grammarAccess.getBooleanAssignmentAccess().getVariableBooleanVariableCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBooleanAssignment2314); 

                	newLeafNode(otherlv_3, grammarAccess.getBooleanAssignmentAccess().getColonEqualsSignKeyword_3());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1100:1: ( (lv_expression_4_0= rulebooleanData ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1101:1: (lv_expression_4_0= rulebooleanData )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1101:1: (lv_expression_4_0= rulebooleanData )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1102:3: lv_expression_4_0= rulebooleanData
            {
             
            	        newCompositeNode(grammarAccess.getBooleanAssignmentAccess().getExpressionBooleanDataParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulebooleanData_in_ruleBooleanAssignment2335);
            lv_expression_4_0=rulebooleanData();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"booleanData");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanAssignment"


    // $ANTLR start "entryRuleIntegerAssignment"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1126:1: entryRuleIntegerAssignment returns [EObject current=null] : iv_ruleIntegerAssignment= ruleIntegerAssignment EOF ;
    public final EObject entryRuleIntegerAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerAssignment = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1127:2: (iv_ruleIntegerAssignment= ruleIntegerAssignment EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1128:2: iv_ruleIntegerAssignment= ruleIntegerAssignment EOF
            {
             newCompositeNode(grammarAccess.getIntegerAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment2371);
            iv_ruleIntegerAssignment=ruleIntegerAssignment();

            state._fsp--;

             current =iv_ruleIntegerAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerAssignment2381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerAssignment"


    // $ANTLR start "ruleIntegerAssignment"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1135:1: ruleIntegerAssignment returns [EObject current=null] : ( () ( (lv__name_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_expression_4_0= ruleintegerData ) ) ) ;
    public final EObject ruleIntegerAssignment() throws RecognitionException {
        EObject current = null;

        Token lv__name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1138:28: ( ( () ( (lv__name_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_expression_4_0= ruleintegerData ) ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1139:1: ( () ( (lv__name_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_expression_4_0= ruleintegerData ) ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1139:1: ( () ( (lv__name_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_expression_4_0= ruleintegerData ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1139:2: () ( (lv__name_1_0= RULE_STRING ) )? ( (otherlv_2= RULE_ID ) ) otherlv_3= ':=' ( (lv_expression_4_0= ruleintegerData ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1139:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1140:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntegerAssignmentAccess().getAssignmentAction_0(),
                        current);
                

            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1145:2: ( (lv__name_1_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1146:1: (lv__name_1_0= RULE_STRING )
                    {
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1146:1: (lv__name_1_0= RULE_STRING )
                    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1147:3: lv__name_1_0= RULE_STRING
                    {
                    lv__name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIntegerAssignment2432); 

                    			newLeafNode(lv__name_1_0, grammarAccess.getIntegerAssignmentAccess().get_nameSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerAssignmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"_name",
                            		lv__name_1_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1163:3: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1164:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1164:1: (otherlv_2= RULE_ID )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1165:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerAssignmentRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIntegerAssignment2458); 

            		newLeafNode(otherlv_2, grammarAccess.getIntegerAssignmentAccess().getVariableIntegerVariableCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntegerAssignment2470); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerAssignmentAccess().getColonEqualsSignKeyword_3());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1180:1: ( (lv_expression_4_0= ruleintegerData ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1181:1: (lv_expression_4_0= ruleintegerData )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1181:1: (lv_expression_4_0= ruleintegerData )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1182:3: lv_expression_4_0= ruleintegerData
            {
             
            	        newCompositeNode(grammarAccess.getIntegerAssignmentAccess().getExpressionIntegerDataParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleintegerData_in_ruleIntegerAssignment2491);
            lv_expression_4_0=ruleintegerData();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"integerData");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerAssignment"


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1206:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1207:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1208:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition2527);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition2537); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1215:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (otherlv_6= RULE_STRING ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1218:28: ( ( () otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (otherlv_6= RULE_STRING ) ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1219:1: ( () otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (otherlv_6= RULE_STRING ) ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1219:1: ( () otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (otherlv_6= RULE_STRING ) ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1219:2: () otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (otherlv_6= RULE_STRING ) )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1219:2: ()
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1220:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransitionAccess().getTransitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTransition2583); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getFromKeyword_1());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1229:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1230:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1230:1: (otherlv_2= RULE_ID )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1231:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransition2603); 

            		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTransition2615); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getToKeyword_3());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1246:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1247:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1247:1: (otherlv_4= RULE_ID )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1248:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransition2635); 

            		newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getTargetStateCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTransition2647); 

                	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getForKeyword_5());
                
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1263:1: ( (otherlv_6= RULE_STRING ) )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1264:1: (otherlv_6= RULE_STRING )
            {
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1264:1: (otherlv_6= RULE_STRING )
            // ../org.xtext.idm.projet/src-gen/org/xtext/idm/projet/parser/antlr/internal/InternalStateMachine.g:1265:3: otherlv_6= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTransition2667); 

            		newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getEventEventCrossReference_6_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleStateMachine131 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStateMachine148 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine165 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleStateMachine186 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_13_in_ruleStateMachine199 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine211 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleStateMachine232 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleStateMachine245 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEvent_in_ruleStateMachine266 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine280 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleoneState_in_ruleStateMachine301 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_ruleoneState_in_ruleStateMachine322 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_ruleInitialState_in_ruleStateMachine344 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStateMachine365 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStateMachine386 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable435 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleintegerVariable_in_ruleVariable492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleanVariable_in_ruleVariable519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleintegerVariable_in_entryRuleintegerVariable554 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleintegerVariable564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleintegerVariable610 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleintegerVariable627 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleintegerVariable644 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleintegerVariable656 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleintegerVariable669 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleintegerData_in_ruleintegerVariable690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleanVariable_in_entryRulebooleanVariable728 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleanVariable738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulebooleanVariable784 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulebooleanVariable801 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulebooleanVariable818 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_rulebooleanVariable830 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_rulebooleanVariable843 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rulebooleanData_in_rulebooleanVariable864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleintegerData_in_entryRuleintegerData904 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleintegerData914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleintegerData965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleanData_in_entryRulebooleanData1006 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleanData1016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBool_in_rulebooleanData1071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBool_in_entryRuleBool1108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBool1119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleBool1157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleBool1176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1216 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEvent1226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoneState_in_entryRuleoneState1318 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoneState1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_ruleoneState1375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeState_in_ruleoneState1402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleState1493 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState1510 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleState1527 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleState1548 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleState1561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeState_in_entryRuleCompositeState1597 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeState1607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleCompositeState1653 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeState1670 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCompositeState1687 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleState_in_ruleCompositeState1708 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_ruleState_in_ruleCompositeState1729 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_ruleInitialState_in_ruleCompositeState1751 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCompositeState1763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitialState_in_entryRuleInitialState1799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitialState1809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleInitialState1855 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleInitialState1867 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInitialState1887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1923 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleOperation1979 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOperation1991 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleOperation2012 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleOperation2025 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleOperation2046 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_15_in_ruleOperation2060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment2096 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment2106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanAssignment_in_ruleAssignment2153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerAssignment_in_ruleAssignment2180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanAssignment_in_entryRuleBooleanAssignment2215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAssignment2225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleBooleanAssignment2276 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanAssignment2302 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBooleanAssignment2314 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rulebooleanData_in_ruleBooleanAssignment2335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerAssignment_in_entryRuleIntegerAssignment2371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerAssignment2381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIntegerAssignment2432 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerAssignment2458 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntegerAssignment2470 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleintegerData_in_ruleIntegerAssignment2491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2527 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition2537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleTransition2583 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransition2603 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleTransition2615 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransition2635 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleTransition2647 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition2667 = new BitSet(new long[]{0x0000000000000002L});
    }


}