// Generated from traductor.g4 by ANTLR 4.4
package compiladores.Translate_ProjectCompi;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class traductorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABST_NOUNS=1, CONC_NOUNS=2, COM_NOUNS=3, PLACES=4, UNCOUNT_NOUNS=5, POSS_ADJ=6, 
		ADJ=7, DEMOST_ADJ=8, CAL_CMN_ADJ=9, CAL_COLOR_ADJ=10, CAL_CONDITION_ADJ=11, 
		CAL_PERSONALITY_POSITIVE_ADJ=12, CAL_PERSONALITY_NEGATIVE_ADJ=13, CAL_SHAPE_ADJ=14, 
		CAL_SIZE_ADJ=15, CAL_SOUND_ADJ=16, CAL_TIME_ADJ=17, CAL_TASTETOUCH_ADJ=18, 
		CAL_TOUCH_ADJ=19, CAL_QUANTITY_ADJ=20, ORD_NUMBERS=21, CARD_NUMBERS=22, 
		UND_ADJ=23, ART_DEF=24, ART_INDEF=25, PER_PRONOUNS=26, DEM_PRONOUN=27, 
		INTERR_PRONOUNS=28, REG_VERBS=29, IRRE_VERBS=30, PAST_PARTICIPLE_VERBS_IRREGULAR=31, 
		PAST_PARTICIPLE_REGULAR_VERBS=32, ADV_TIME=33, ADV_PLACE=34, ADV_QUANTITY=35, 
		ADV_MODE=36, AFFIRM_ADVERBS=37, NEG_ADVERBS=38, ADV_DOUBT=39, GERUNDS=40, 
		PREPS=41, TO_BE=42, TO_BE_NEG=43, CONJ=44, CONJ_COP=45, CONJ_ADV=46, CONJ_DIST=47, 
		CONJ_DISYU=48, CONJ_EXPLI=49, CONJU_SUB=50, COORD_CONJUNCTIONS=51, CONJ_CON=52, 
		CONJ_CAS=53, CONJ_CONSE=54, CONJ_COMP=55, CONJ_FIN=56, INTERJECT=57, SIGNS=58, 
		DO=59, DOES=60, WOULD=61, CAN=62, SHOULD=63, HAVE=64, HAS=65, AUXDONT=66, 
		WOULDNT=67, CANT=68, SHOULDNT=69, AUXHAVE=70, WS=71;
	public static final String[] tokenNames = {
		"<INVALID>", "ABST_NOUNS", "CONC_NOUNS", "COM_NOUNS", "PLACES", "UNCOUNT_NOUNS", 
		"POSS_ADJ", "ADJ", "DEMOST_ADJ", "CAL_CMN_ADJ", "CAL_COLOR_ADJ", "CAL_CONDITION_ADJ", 
		"CAL_PERSONALITY_POSITIVE_ADJ", "CAL_PERSONALITY_NEGATIVE_ADJ", "CAL_SHAPE_ADJ", 
		"CAL_SIZE_ADJ", "CAL_SOUND_ADJ", "CAL_TIME_ADJ", "CAL_TASTETOUCH_ADJ", 
		"CAL_TOUCH_ADJ", "CAL_QUANTITY_ADJ", "ORD_NUMBERS", "CARD_NUMBERS", "UND_ADJ", 
		"'the'", "ART_INDEF", "PER_PRONOUNS", "DEM_PRONOUN", "INTERR_PRONOUNS", 
		"REG_VERBS", "IRRE_VERBS", "PAST_PARTICIPLE_VERBS_IRREGULAR", "PAST_PARTICIPLE_REGULAR_VERBS", 
		"ADV_TIME", "ADV_PLACE", "ADV_QUANTITY", "ADV_MODE", "AFFIRM_ADVERBS", 
		"NEG_ADVERBS", "ADV_DOUBT", "GERUNDS", "PREPS", "TO_BE", "TO_BE_NEG", 
		"CONJ", "CONJ_COP", "CONJ_ADV", "CONJ_DIST", "'or'", "CONJ_EXPLI", "CONJU_SUB", 
		"COORD_CONJUNCTIONS", "CONJ_CON", "CONJ_CAS", "CONJ_CONSE", "CONJ_COMP", 
		"CONJ_FIN", "INTERJECT", "SIGNS", "'do'", "'does'", "'would'", "'can'", 
		"'should'", "'have'", "'has'", "AUXDONT", "WOULDNT", "CANT", "SHOULDNT", 
		"AUXHAVE", "WS"
	};
	public static final int
		RULE_oracion = 0, RULE_present_s = 1, RULE_present_c = 2, RULE_sentence_p = 3, 
		RULE_sentence_aux = 4, RULE_simple_presentneg = 5, RULE_present_contneg = 6, 
		RULE_part_sentneg = 7, RULE_aux_sentneg = 8, RULE_aux_neg = 9, RULE_aux_have_neg = 10, 
		RULE_auxdont = 11, RULE_adjetives = 12, RULE_tobe_neg = 13, RULE_articles = 14, 
		RULE_past_part = 15, RULE_nouns_sp = 16, RULE_verbs = 17, RULE_compl = 18, 
		RULE_aux_h = 19, RULE_aux = 20, RULE_per_pro = 21, RULE_to_be = 22, RULE_verbsg = 23;
	public static final String[] ruleNames = {
		"oracion", "present_s", "present_c", "sentence_p", "sentence_aux", "simple_presentneg", 
		"present_contneg", "part_sentneg", "aux_sentneg", "aux_neg", "aux_have_neg", 
		"auxdont", "adjetives", "tobe_neg", "articles", "past_part", "nouns_sp", 
		"verbs", "compl", "aux_h", "aux", "per_pro", "to_be", "verbsg"
	};

	@Override
	public String getGrammarFileName() { return "traductor.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public traductorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OracionContext extends ParserRuleContext {
		public Sentence_pContext sentence_p() {
			return getRuleContext(Sentence_pContext.class,0);
		}
		public Simple_presentnegContext simple_presentneg() {
			return getRuleContext(Simple_presentnegContext.class,0);
		}
		public Aux_sentnegContext aux_sentneg() {
			return getRuleContext(Aux_sentnegContext.class,0);
		}
		public Present_cContext present_c() {
			return getRuleContext(Present_cContext.class,0);
		}
		public Present_contnegContext present_contneg() {
			return getRuleContext(Present_contnegContext.class,0);
		}
		public Part_sentnegContext part_sentneg() {
			return getRuleContext(Part_sentnegContext.class,0);
		}
		public Sentence_auxContext sentence_aux() {
			return getRuleContext(Sentence_auxContext.class,0);
		}
		public Present_sContext present_s() {
			return getRuleContext(Present_sContext.class,0);
		}
		public OracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterOracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitOracion(this);
		}
	}

	public final OracionContext oracion() throws RecognitionException {
		OracionContext _localctx = new OracionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_oracion);
		try {
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); present_s();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); present_c();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50); sentence_aux();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51); sentence_p();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52); simple_presentneg();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53); present_contneg();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54); part_sentneg();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(55); aux_sentneg();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Present_sContext extends ParserRuleContext {
		public VerbsContext verbs() {
			return getRuleContext(VerbsContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode POSS_ADJ() { return getToken(traductorParser.POSS_ADJ, 0); }
		public ComplContext compl() {
			return getRuleContext(ComplContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public Per_proContext per_pro() {
			return getRuleContext(Per_proContext.class,0);
		}
		public Present_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_present_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterPresent_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitPresent_s(this);
		}
	}

	public final Present_sContext present_s() throws RecognitionException {
		Present_sContext _localctx = new Present_sContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_present_s);
		int _la;
		try {
			setState(75);
			switch (_input.LA(1)) {
			case ART_DEF:
			case ART_INDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); articles();
				setState(59); nouns_sp();
				setState(60); verbs();
				setState(62);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(61); compl();
					}
				}

				}
				break;
			case POSS_ADJ:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); match(POSS_ADJ);
				setState(65); nouns_sp();
				setState(66); verbs();
				setState(68);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(67); compl();
					}
				}

				}
				break;
			case PER_PRONOUNS:
				enterOuterAlt(_localctx, 3);
				{
				setState(70); per_pro();
				setState(71); verbs();
				setState(73);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(72); compl();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Present_cContext extends ParserRuleContext {
		public AdjetivesContext adjetives() {
			return getRuleContext(AdjetivesContext.class,0);
		}
		public To_beContext to_be() {
			return getRuleContext(To_beContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode POSS_ADJ() { return getToken(traductorParser.POSS_ADJ, 0); }
		public TerminalNode ADJ() { return getToken(traductorParser.ADJ, 0); }
		public ComplContext compl() {
			return getRuleContext(ComplContext.class,0);
		}
		public TerminalNode ART_INDEF() { return getToken(traductorParser.ART_INDEF, 0); }
		public VerbsgContext verbsg() {
			return getRuleContext(VerbsgContext.class,0);
		}
		public Per_proContext per_pro() {
			return getRuleContext(Per_proContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode CONC_NOUNS() { return getToken(traductorParser.CONC_NOUNS, 0); }
		public Present_cContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_present_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterPresent_c(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitPresent_c(this);
		}
	}

	public final Present_cContext present_c() throws RecognitionException {
		Present_cContext _localctx = new Present_cContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_present_c);
		int _la;
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); per_pro();
				setState(78); to_be();
				setState(79); verbsg();
				setState(81);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(80); compl();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); articles();
				setState(84); nouns_sp();
				setState(85); to_be();
				setState(86); verbsg();
				setState(88);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(87); compl();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90); match(POSS_ADJ);
				setState(91); nouns_sp();
				setState(92); to_be();
				setState(93); verbsg();
				setState(95);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(94); compl();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97); per_pro();
				setState(98); to_be();
				setState(99); match(ART_INDEF);
				setState(100); match(CONC_NOUNS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102); per_pro();
				setState(103); to_be();
				setState(104); adjetives();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106); articles();
				setState(107); nouns_sp();
				setState(108); to_be();
				setState(109); adjetives();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(111); match(POSS_ADJ);
				setState(112); nouns_sp();
				setState(113); to_be();
				setState(114); adjetives();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(116); articles();
				setState(117); nouns_sp();
				setState(118); to_be();
				setState(119); verbsg();
				setState(120); match(ADJ);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(122); match(POSS_ADJ);
				setState(123); nouns_sp();
				setState(124); to_be();
				setState(125); verbsg();
				setState(126); match(ADJ);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentence_pContext extends ParserRuleContext {
		public Past_partContext past_part() {
			return getRuleContext(Past_partContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode POSS_ADJ() { return getToken(traductorParser.POSS_ADJ, 0); }
		public ComplContext compl() {
			return getRuleContext(ComplContext.class,0);
		}
		public TerminalNode PAST_PARTICIPLE_VERBS_IRREGULAR() { return getToken(traductorParser.PAST_PARTICIPLE_VERBS_IRREGULAR, 0); }
		public Aux_hContext aux_h() {
			return getRuleContext(Aux_hContext.class,0);
		}
		public VerbsgContext verbsg() {
			return getRuleContext(VerbsgContext.class,0);
		}
		public Per_proContext per_pro() {
			return getRuleContext(Per_proContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public Sentence_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterSentence_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitSentence_p(this);
		}
	}

	public final Sentence_pContext sentence_p() throws RecognitionException {
		Sentence_pContext _localctx = new Sentence_pContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence_p);
		int _la;
		try {
			setState(157);
			switch (_input.LA(1)) {
			case PER_PRONOUNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); per_pro();
				setState(131); aux_h();
				setState(132); past_part();
				setState(133); verbsg();
				setState(135);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(134); compl();
					}
				}

				}
				break;
			case ART_DEF:
			case ART_INDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); articles();
				setState(138); nouns_sp();
				setState(139); aux_h();
				setState(140); past_part();
				setState(142);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(141); verbsg();
					}
				}

				setState(145);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(144); compl();
					}
				}

				}
				break;
			case POSS_ADJ:
				enterOuterAlt(_localctx, 3);
				{
				setState(147); match(POSS_ADJ);
				setState(148); nouns_sp();
				setState(149); aux_h();
				setState(150); match(PAST_PARTICIPLE_VERBS_IRREGULAR);
				setState(152);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(151); verbsg();
					}
				}

				setState(155);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(154); compl();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sentence_auxContext extends ParserRuleContext {
		public AuxContext aux() {
			return getRuleContext(AuxContext.class,0);
		}
		public VerbsContext verbs() {
			return getRuleContext(VerbsContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode POSS_ADJ() { return getToken(traductorParser.POSS_ADJ, 0); }
		public Per_proContext per_pro() {
			return getRuleContext(Per_proContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public Sentence_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterSentence_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitSentence_aux(this);
		}
	}

	public final Sentence_auxContext sentence_aux() throws RecognitionException {
		Sentence_auxContext _localctx = new Sentence_auxContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentence_aux);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case PER_PRONOUNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); per_pro();
				setState(160); aux();
				setState(161); verbs();
				}
				break;
			case ART_DEF:
			case ART_INDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(163); articles();
				setState(164); nouns_sp();
				setState(165); aux();
				setState(166); verbs();
				}
				break;
			case POSS_ADJ:
				enterOuterAlt(_localctx, 3);
				{
				setState(168); match(POSS_ADJ);
				setState(169); nouns_sp();
				setState(170); aux();
				setState(171); verbs();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_presentnegContext extends ParserRuleContext {
		public VerbsContext verbs() {
			return getRuleContext(VerbsContext.class,0);
		}
		public AuxdontContext auxdont() {
			return getRuleContext(AuxdontContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode POSS_ADJ() { return getToken(traductorParser.POSS_ADJ, 0); }
		public ComplContext compl() {
			return getRuleContext(ComplContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public Per_proContext per_pro() {
			return getRuleContext(Per_proContext.class,0);
		}
		public Simple_presentnegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_presentneg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterSimple_presentneg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitSimple_presentneg(this);
		}
	}

	public final Simple_presentnegContext simple_presentneg() throws RecognitionException {
		Simple_presentnegContext _localctx = new Simple_presentnegContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_presentneg);
		int _la;
		try {
			setState(195);
			switch (_input.LA(1)) {
			case ART_DEF:
			case ART_INDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(175); articles();
				setState(176); nouns_sp();
				setState(177); auxdont();
				setState(178); verbs();
				setState(180);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(179); compl();
					}
				}

				}
				break;
			case POSS_ADJ:
				enterOuterAlt(_localctx, 2);
				{
				setState(182); match(POSS_ADJ);
				setState(183); nouns_sp();
				setState(184); auxdont();
				setState(185); verbs();
				setState(187);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(186); compl();
					}
				}

				}
				break;
			case PER_PRONOUNS:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); per_pro();
				setState(190); auxdont();
				setState(191); verbs();
				setState(193);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(192); compl();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Present_contnegContext extends ParserRuleContext {
		public AdjetivesContext adjetives() {
			return getRuleContext(AdjetivesContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode POSS_ADJ() { return getToken(traductorParser.POSS_ADJ, 0); }
		public TerminalNode ADJ() { return getToken(traductorParser.ADJ, 0); }
		public Tobe_negContext tobe_neg() {
			return getRuleContext(Tobe_negContext.class,0);
		}
		public ComplContext compl() {
			return getRuleContext(ComplContext.class,0);
		}
		public TerminalNode ART_INDEF() { return getToken(traductorParser.ART_INDEF, 0); }
		public VerbsgContext verbsg() {
			return getRuleContext(VerbsgContext.class,0);
		}
		public Per_proContext per_pro() {
			return getRuleContext(Per_proContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public TerminalNode CONC_NOUNS() { return getToken(traductorParser.CONC_NOUNS, 0); }
		public Present_contnegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_present_contneg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterPresent_contneg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitPresent_contneg(this);
		}
	}

	public final Present_contnegContext present_contneg() throws RecognitionException {
		Present_contnegContext _localctx = new Present_contnegContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_present_contneg);
		int _la;
		try {
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); per_pro();
				setState(198); tobe_neg();
				setState(199); verbsg();
				setState(201);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(200); compl();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); articles();
				setState(204); nouns_sp();
				setState(205); tobe_neg();
				setState(206); verbsg();
				setState(208);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(207); compl();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210); match(POSS_ADJ);
				setState(211); nouns_sp();
				setState(212); tobe_neg();
				setState(213); verbsg();
				setState(215);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(214); compl();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217); per_pro();
				setState(218); tobe_neg();
				setState(219); match(ART_INDEF);
				setState(220); match(CONC_NOUNS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222); per_pro();
				setState(223); tobe_neg();
				setState(224); adjetives();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226); articles();
				setState(227); nouns_sp();
				setState(228); tobe_neg();
				setState(229); adjetives();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(231); match(POSS_ADJ);
				setState(232); nouns_sp();
				setState(233); tobe_neg();
				setState(234); adjetives();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(236); articles();
				setState(237); nouns_sp();
				setState(238); tobe_neg();
				setState(239); verbsg();
				setState(240); match(ADJ);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(242); match(POSS_ADJ);
				setState(243); nouns_sp();
				setState(244); tobe_neg();
				setState(245); match(ADJ);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Part_sentnegContext extends ParserRuleContext {
		public Past_partContext past_part() {
			return getRuleContext(Past_partContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode POSS_ADJ() { return getToken(traductorParser.POSS_ADJ, 0); }
		public ComplContext compl() {
			return getRuleContext(ComplContext.class,0);
		}
		public TerminalNode PAST_PARTICIPLE_VERBS_IRREGULAR() { return getToken(traductorParser.PAST_PARTICIPLE_VERBS_IRREGULAR, 0); }
		public VerbsgContext verbsg() {
			return getRuleContext(VerbsgContext.class,0);
		}
		public Per_proContext per_pro() {
			return getRuleContext(Per_proContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public Aux_have_negContext aux_have_neg() {
			return getRuleContext(Aux_have_negContext.class,0);
		}
		public Part_sentnegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_sentneg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterPart_sentneg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitPart_sentneg(this);
		}
	}

	public final Part_sentnegContext part_sentneg() throws RecognitionException {
		Part_sentnegContext _localctx = new Part_sentnegContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_part_sentneg);
		int _la;
		try {
			setState(276);
			switch (_input.LA(1)) {
			case PER_PRONOUNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); per_pro();
				setState(250); aux_have_neg();
				setState(251); past_part();
				setState(252); verbsg();
				setState(254);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(253); compl();
					}
				}

				}
				break;
			case ART_DEF:
			case ART_INDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(256); articles();
				setState(257); nouns_sp();
				setState(258); aux_have_neg();
				setState(259); past_part();
				setState(261);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(260); verbsg();
					}
				}

				setState(264);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(263); compl();
					}
				}

				}
				break;
			case POSS_ADJ:
				enterOuterAlt(_localctx, 3);
				{
				setState(266); match(POSS_ADJ);
				setState(267); nouns_sp();
				setState(268); aux_have_neg();
				setState(269); match(PAST_PARTICIPLE_VERBS_IRREGULAR);
				setState(271);
				_la = _input.LA(1);
				if (_la==GERUNDS) {
					{
					setState(270); verbsg();
					}
				}

				setState(274);
				_la = _input.LA(1);
				if (_la==PREPS) {
					{
					setState(273); compl();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aux_sentnegContext extends ParserRuleContext {
		public Aux_negContext aux_neg() {
			return getRuleContext(Aux_negContext.class,0);
		}
		public VerbsContext verbs() {
			return getRuleContext(VerbsContext.class,0);
		}
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode POSS_ADJ() { return getToken(traductorParser.POSS_ADJ, 0); }
		public Per_proContext per_pro() {
			return getRuleContext(Per_proContext.class,0);
		}
		public Nouns_spContext nouns_sp() {
			return getRuleContext(Nouns_spContext.class,0);
		}
		public Aux_sentnegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux_sentneg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterAux_sentneg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitAux_sentneg(this);
		}
	}

	public final Aux_sentnegContext aux_sentneg() throws RecognitionException {
		Aux_sentnegContext _localctx = new Aux_sentnegContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aux_sentneg);
		try {
			setState(292);
			switch (_input.LA(1)) {
			case PER_PRONOUNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(278); per_pro();
				setState(279); aux_neg();
				setState(280); verbs();
				}
				break;
			case ART_DEF:
			case ART_INDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); articles();
				setState(283); nouns_sp();
				setState(284); aux_neg();
				setState(285); verbs();
				}
				break;
			case POSS_ADJ:
				enterOuterAlt(_localctx, 3);
				{
				setState(287); match(POSS_ADJ);
				setState(288); nouns_sp();
				setState(289); aux_neg();
				setState(290); verbs();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aux_negContext extends ParserRuleContext {
		public TerminalNode CANT() { return getToken(traductorParser.CANT, 0); }
		public TerminalNode WOULDNT() { return getToken(traductorParser.WOULDNT, 0); }
		public TerminalNode SHOULDNT() { return getToken(traductorParser.SHOULDNT, 0); }
		public Aux_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterAux_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitAux_neg(this);
		}
	}

	public final Aux_negContext aux_neg() throws RecognitionException {
		Aux_negContext _localctx = new Aux_negContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_aux_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (WOULDNT - 67)) | (1L << (CANT - 67)) | (1L << (SHOULDNT - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aux_have_negContext extends ParserRuleContext {
		public TerminalNode AUXHAVE() { return getToken(traductorParser.AUXHAVE, 0); }
		public Aux_have_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux_have_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterAux_have_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitAux_have_neg(this);
		}
	}

	public final Aux_have_negContext aux_have_neg() throws RecognitionException {
		Aux_have_negContext _localctx = new Aux_have_negContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_aux_have_neg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(AUXHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuxdontContext extends ParserRuleContext {
		public TerminalNode AUXDONT() { return getToken(traductorParser.AUXDONT, 0); }
		public AuxdontContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxdont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterAuxdont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitAuxdont(this);
		}
	}

	public final AuxdontContext auxdont() throws RecognitionException {
		AuxdontContext _localctx = new AuxdontContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_auxdont);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); match(AUXDONT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdjetivesContext extends ParserRuleContext {
		public TerminalNode CAL_TASTETOUCH_ADJ() { return getToken(traductorParser.CAL_TASTETOUCH_ADJ, 0); }
		public TerminalNode CAL_COLOR_ADJ() { return getToken(traductorParser.CAL_COLOR_ADJ, 0); }
		public TerminalNode CAL_SOUND_ADJ() { return getToken(traductorParser.CAL_SOUND_ADJ, 0); }
		public TerminalNode CAL_PERSONALITY_POSITIVE_ADJ() { return getToken(traductorParser.CAL_PERSONALITY_POSITIVE_ADJ, 0); }
		public TerminalNode CAL_PERSONALITY_NEGATIVE_ADJ() { return getToken(traductorParser.CAL_PERSONALITY_NEGATIVE_ADJ, 0); }
		public TerminalNode CAL_CMN_ADJ() { return getToken(traductorParser.CAL_CMN_ADJ, 0); }
		public TerminalNode CAL_SIZE_ADJ() { return getToken(traductorParser.CAL_SIZE_ADJ, 0); }
		public TerminalNode CAL_CONDITION_ADJ() { return getToken(traductorParser.CAL_CONDITION_ADJ, 0); }
		public TerminalNode CAL_TIME_ADJ() { return getToken(traductorParser.CAL_TIME_ADJ, 0); }
		public TerminalNode CAL_TOUCH_ADJ() { return getToken(traductorParser.CAL_TOUCH_ADJ, 0); }
		public TerminalNode CAL_QUANTITY_ADJ() { return getToken(traductorParser.CAL_QUANTITY_ADJ, 0); }
		public AdjetivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjetives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterAdjetives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitAdjetives(this);
		}
	}

	public final AdjetivesContext adjetives() throws RecognitionException {
		AdjetivesContext _localctx = new AdjetivesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_adjetives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CAL_CMN_ADJ) | (1L << CAL_COLOR_ADJ) | (1L << CAL_CONDITION_ADJ) | (1L << CAL_PERSONALITY_POSITIVE_ADJ) | (1L << CAL_PERSONALITY_NEGATIVE_ADJ) | (1L << CAL_SIZE_ADJ) | (1L << CAL_SOUND_ADJ) | (1L << CAL_TIME_ADJ) | (1L << CAL_TASTETOUCH_ADJ) | (1L << CAL_TOUCH_ADJ) | (1L << CAL_QUANTITY_ADJ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tobe_negContext extends ParserRuleContext {
		public TerminalNode TO_BE_NEG() { return getToken(traductorParser.TO_BE_NEG, 0); }
		public Tobe_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tobe_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterTobe_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitTobe_neg(this);
		}
	}

	public final Tobe_negContext tobe_neg() throws RecognitionException {
		Tobe_negContext _localctx = new Tobe_negContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tobe_neg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); match(TO_BE_NEG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArticlesContext extends ParserRuleContext {
		public TerminalNode ART_DEF() { return getToken(traductorParser.ART_DEF, 0); }
		public TerminalNode ART_INDEF() { return getToken(traductorParser.ART_INDEF, 0); }
		public ArticlesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_articles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterArticles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitArticles(this);
		}
	}

	public final ArticlesContext articles() throws RecognitionException {
		ArticlesContext _localctx = new ArticlesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_articles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==ART_DEF || _la==ART_INDEF) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Past_partContext extends ParserRuleContext {
		public TerminalNode PAST_PARTICIPLE_REGULAR_VERBS() { return getToken(traductorParser.PAST_PARTICIPLE_REGULAR_VERBS, 0); }
		public TerminalNode PAST_PARTICIPLE_VERBS_IRREGULAR() { return getToken(traductorParser.PAST_PARTICIPLE_VERBS_IRREGULAR, 0); }
		public Past_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_past_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterPast_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitPast_part(this);
		}
	}

	public final Past_partContext past_part() throws RecognitionException {
		Past_partContext _localctx = new Past_partContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_past_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !(_la==PAST_PARTICIPLE_VERBS_IRREGULAR || _la==PAST_PARTICIPLE_REGULAR_VERBS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nouns_spContext extends ParserRuleContext {
		public TerminalNode COM_NOUNS() { return getToken(traductorParser.COM_NOUNS, 0); }
		public TerminalNode CONC_NOUNS() { return getToken(traductorParser.CONC_NOUNS, 0); }
		public Nouns_spContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nouns_sp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterNouns_sp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitNouns_sp(this);
		}
	}

	public final Nouns_spContext nouns_sp() throws RecognitionException {
		Nouns_spContext _localctx = new Nouns_spContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nouns_sp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !(_la==CONC_NOUNS || _la==COM_NOUNS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbsContext extends ParserRuleContext {
		public TerminalNode IRRE_VERBS() { return getToken(traductorParser.IRRE_VERBS, 0); }
		public TerminalNode REG_VERBS() { return getToken(traductorParser.REG_VERBS, 0); }
		public VerbsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterVerbs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitVerbs(this);
		}
	}

	public final VerbsContext verbs() throws RecognitionException {
		VerbsContext _localctx = new VerbsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_verbs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==REG_VERBS || _la==IRRE_VERBS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplContext extends ParserRuleContext {
		public TerminalNode PLACES() { return getToken(traductorParser.PLACES, 0); }
		public ArticlesContext articles() {
			return getRuleContext(ArticlesContext.class,0);
		}
		public TerminalNode PREPS() { return getToken(traductorParser.PREPS, 0); }
		public ComplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterCompl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitCompl(this);
		}
	}

	public final ComplContext compl() throws RecognitionException {
		ComplContext _localctx = new ComplContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(PREPS);
			setState(313); articles();
			setState(314); match(PLACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aux_hContext extends ParserRuleContext {
		public TerminalNode HAVE() { return getToken(traductorParser.HAVE, 0); }
		public TerminalNode HAS() { return getToken(traductorParser.HAS, 0); }
		public Aux_hContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux_h; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterAux_h(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitAux_h(this);
		}
	}

	public final Aux_hContext aux_h() throws RecognitionException {
		Aux_hContext _localctx = new Aux_hContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_aux_h);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==HAVE || _la==HAS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuxContext extends ParserRuleContext {
		public TerminalNode SHOULD() { return getToken(traductorParser.SHOULD, 0); }
		public TerminalNode CAN() { return getToken(traductorParser.CAN, 0); }
		public TerminalNode WOULD() { return getToken(traductorParser.WOULD, 0); }
		public AuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitAux(this);
		}
	}

	public final AuxContext aux() throws RecognitionException {
		AuxContext _localctx = new AuxContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WOULD) | (1L << CAN) | (1L << SHOULD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Per_proContext extends ParserRuleContext {
		public TerminalNode PER_PRONOUNS() { return getToken(traductorParser.PER_PRONOUNS, 0); }
		public Per_proContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_per_pro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterPer_pro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitPer_pro(this);
		}
	}

	public final Per_proContext per_pro() throws RecognitionException {
		Per_proContext _localctx = new Per_proContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_per_pro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(PER_PRONOUNS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class To_beContext extends ParserRuleContext {
		public TerminalNode TO_BE() { return getToken(traductorParser.TO_BE, 0); }
		public To_beContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to_be; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterTo_be(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitTo_be(this);
		}
	}

	public final To_beContext to_be() throws RecognitionException {
		To_beContext _localctx = new To_beContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_to_be);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(TO_BE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbsgContext extends ParserRuleContext {
		public TerminalNode GERUNDS() { return getToken(traductorParser.GERUNDS, 0); }
		public VerbsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbsg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).enterVerbsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof traductorListener ) ((traductorListener)listener).exitVerbsg(this);
		}
	}

	public final VerbsgContext verbsg() throws RecognitionException {
		VerbsgContext _localctx = new VerbsgContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_verbsg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(GERUNDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3I\u0149\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2;\n\2\3\3\3\3\3\3\3\3\5\3A\n\3\3\3"+
		"\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\5\3L\n\3\5\3N\n\3\3\4\3\4\3\4\3\4\5"+
		"\4T\n\4\3\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\4\3\4\3\4\3\4\3\4\5\4b\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0083\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u008a\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u0091\n\5\3\5\5\5"+
		"\u0094\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u009b\n\5\3\5\5\5\u009e\n\5\5\5\u00a0"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b0"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00b7\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00be\n"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00c4\n\7\5\7\u00c6\n\7\3\b\3\b\3\b\3\b\5\b\u00cc"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d3\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u00da\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00fa\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0101\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0108\n\t\3\t\5"+
		"\t\u010b\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0112\n\t\3\t\5\t\u0115\n\t\5\t\u0117"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0127"+
		"\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\2\n\3\2EG\4\2\13\17\21\26\3\2\32\33\3\2!\"\3\2\4\5\3\2\37"+
		" \3\2BC\3\2?A\u0169\2:\3\2\2\2\4M\3\2\2\2\6\u0082\3\2\2\2\b\u009f\3\2"+
		"\2\2\n\u00af\3\2\2\2\f\u00c5\3\2\2\2\16\u00f9\3\2\2\2\20\u0116\3\2\2\2"+
		"\22\u0126\3\2\2\2\24\u0128\3\2\2\2\26\u012a\3\2\2\2\30\u012c\3\2\2\2\32"+
		"\u012e\3\2\2\2\34\u0130\3\2\2\2\36\u0132\3\2\2\2 \u0134\3\2\2\2\"\u0136"+
		"\3\2\2\2$\u0138\3\2\2\2&\u013a\3\2\2\2(\u013e\3\2\2\2*\u0140\3\2\2\2,"+
		"\u0142\3\2\2\2.\u0144\3\2\2\2\60\u0146\3\2\2\2\62;\5\4\3\2\63;\5\6\4\2"+
		"\64;\5\n\6\2\65;\5\b\5\2\66;\5\f\7\2\67;\5\16\b\28;\5\20\t\29;\5\22\n"+
		"\2:\62\3\2\2\2:\63\3\2\2\2:\64\3\2\2\2:\65\3\2\2\2:\66\3\2\2\2:\67\3\2"+
		"\2\2:8\3\2\2\2:9\3\2\2\2;\3\3\2\2\2<=\5\36\20\2=>\5\"\22\2>@\5$\23\2?"+
		"A\5&\24\2@?\3\2\2\2@A\3\2\2\2AN\3\2\2\2BC\7\b\2\2CD\5\"\22\2DF\5$\23\2"+
		"EG\5&\24\2FE\3\2\2\2FG\3\2\2\2GN\3\2\2\2HI\5,\27\2IK\5$\23\2JL\5&\24\2"+
		"KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2M<\3\2\2\2MB\3\2\2\2MH\3\2\2\2N\5\3\2\2"+
		"\2OP\5,\27\2PQ\5.\30\2QS\5\60\31\2RT\5&\24\2SR\3\2\2\2ST\3\2\2\2T\u0083"+
		"\3\2\2\2UV\5\36\20\2VW\5\"\22\2WX\5.\30\2XZ\5\60\31\2Y[\5&\24\2ZY\3\2"+
		"\2\2Z[\3\2\2\2[\u0083\3\2\2\2\\]\7\b\2\2]^\5\"\22\2^_\5.\30\2_a\5\60\31"+
		"\2`b\5&\24\2a`\3\2\2\2ab\3\2\2\2b\u0083\3\2\2\2cd\5,\27\2de\5.\30\2ef"+
		"\7\33\2\2fg\7\4\2\2g\u0083\3\2\2\2hi\5,\27\2ij\5.\30\2jk\5\32\16\2k\u0083"+
		"\3\2\2\2lm\5\36\20\2mn\5\"\22\2no\5.\30\2op\5\32\16\2p\u0083\3\2\2\2q"+
		"r\7\b\2\2rs\5\"\22\2st\5.\30\2tu\5\32\16\2u\u0083\3\2\2\2vw\5\36\20\2"+
		"wx\5\"\22\2xy\5.\30\2yz\5\60\31\2z{\7\t\2\2{\u0083\3\2\2\2|}\7\b\2\2}"+
		"~\5\"\22\2~\177\5.\30\2\177\u0080\5\60\31\2\u0080\u0081\7\t\2\2\u0081"+
		"\u0083\3\2\2\2\u0082O\3\2\2\2\u0082U\3\2\2\2\u0082\\\3\2\2\2\u0082c\3"+
		"\2\2\2\u0082h\3\2\2\2\u0082l\3\2\2\2\u0082q\3\2\2\2\u0082v\3\2\2\2\u0082"+
		"|\3\2\2\2\u0083\7\3\2\2\2\u0084\u0085\5,\27\2\u0085\u0086\5(\25\2\u0086"+
		"\u0087\5 \21\2\u0087\u0089\5\60\31\2\u0088\u008a\5&\24\2\u0089\u0088\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u00a0\3\2\2\2\u008b\u008c\5\36\20\2\u008c"+
		"\u008d\5\"\22\2\u008d\u008e\5(\25\2\u008e\u0090\5 \21\2\u008f\u0091\5"+
		"\60\31\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0094\5&\24\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u00a0\3\2"+
		"\2\2\u0095\u0096\7\b\2\2\u0096\u0097\5\"\22\2\u0097\u0098\5(\25\2\u0098"+
		"\u009a\7!\2\2\u0099\u009b\5\60\31\2\u009a\u0099\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\5&\24\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u0084\3\2\2\2\u009f\u008b\3\2"+
		"\2\2\u009f\u0095\3\2\2\2\u00a0\t\3\2\2\2\u00a1\u00a2\5,\27\2\u00a2\u00a3"+
		"\5*\26\2\u00a3\u00a4\5$\23\2\u00a4\u00b0\3\2\2\2\u00a5\u00a6\5\36\20\2"+
		"\u00a6\u00a7\5\"\22\2\u00a7\u00a8\5*\26\2\u00a8\u00a9\5$\23\2\u00a9\u00b0"+
		"\3\2\2\2\u00aa\u00ab\7\b\2\2\u00ab\u00ac\5\"\22\2\u00ac\u00ad\5*\26\2"+
		"\u00ad\u00ae\5$\23\2\u00ae\u00b0\3\2\2\2\u00af\u00a1\3\2\2\2\u00af\u00a5"+
		"\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0\13\3\2\2\2\u00b1\u00b2\5\36\20\2\u00b2"+
		"\u00b3\5\"\22\2\u00b3\u00b4\5\30\r\2\u00b4\u00b6\5$\23\2\u00b5\u00b7\5"+
		"&\24\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00c6\3\2\2\2\u00b8"+
		"\u00b9\7\b\2\2\u00b9\u00ba\5\"\22\2\u00ba\u00bb\5\30\r\2\u00bb\u00bd\5"+
		"$\23\2\u00bc\u00be\5&\24\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c6\3\2\2\2\u00bf\u00c0\5,\27\2\u00c0\u00c1\5\30\r\2\u00c1\u00c3\5"+
		"$\23\2\u00c2\u00c4\5&\24\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00b1\3\2\2\2\u00c5\u00b8\3\2\2\2\u00c5\u00bf\3\2"+
		"\2\2\u00c6\r\3\2\2\2\u00c7\u00c8\5,\27\2\u00c8\u00c9\5\34\17\2\u00c9\u00cb"+
		"\5\60\31\2\u00ca\u00cc\5&\24\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2"+
		"\u00cc\u00fa\3\2\2\2\u00cd\u00ce\5\36\20\2\u00ce\u00cf\5\"\22\2\u00cf"+
		"\u00d0\5\34\17\2\u00d0\u00d2\5\60\31\2\u00d1\u00d3\5&\24\2\u00d2\u00d1"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00fa\3\2\2\2\u00d4\u00d5\7\b\2\2\u00d5"+
		"\u00d6\5\"\22\2\u00d6\u00d7\5\34\17\2\u00d7\u00d9\5\60\31\2\u00d8\u00da"+
		"\5&\24\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00fa\3\2\2\2\u00db"+
		"\u00dc\5,\27\2\u00dc\u00dd\5\34\17\2\u00dd\u00de\7\33\2\2\u00de\u00df"+
		"\7\4\2\2\u00df\u00fa\3\2\2\2\u00e0\u00e1\5,\27\2\u00e1\u00e2\5\34\17\2"+
		"\u00e2\u00e3\5\32\16\2\u00e3\u00fa\3\2\2\2\u00e4\u00e5\5\36\20\2\u00e5"+
		"\u00e6\5\"\22\2\u00e6\u00e7\5\34\17\2\u00e7\u00e8\5\32\16\2\u00e8\u00fa"+
		"\3\2\2\2\u00e9\u00ea\7\b\2\2\u00ea\u00eb\5\"\22\2\u00eb\u00ec\5\34\17"+
		"\2\u00ec\u00ed\5\32\16\2\u00ed\u00fa\3\2\2\2\u00ee\u00ef\5\36\20\2\u00ef"+
		"\u00f0\5\"\22\2\u00f0\u00f1\5\34\17\2\u00f1\u00f2\5\60\31\2\u00f2\u00f3"+
		"\7\t\2\2\u00f3\u00fa\3\2\2\2\u00f4\u00f5\7\b\2\2\u00f5\u00f6\5\"\22\2"+
		"\u00f6\u00f7\5\34\17\2\u00f7\u00f8\7\t\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00c7"+
		"\3\2\2\2\u00f9\u00cd\3\2\2\2\u00f9\u00d4\3\2\2\2\u00f9\u00db\3\2\2\2\u00f9"+
		"\u00e0\3\2\2\2\u00f9\u00e4\3\2\2\2\u00f9\u00e9\3\2\2\2\u00f9\u00ee\3\2"+
		"\2\2\u00f9\u00f4\3\2\2\2\u00fa\17\3\2\2\2\u00fb\u00fc\5,\27\2\u00fc\u00fd"+
		"\5\26\f\2\u00fd\u00fe\5 \21\2\u00fe\u0100\5\60\31\2\u00ff\u0101\5&\24"+
		"\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0117\3\2\2\2\u0102\u0103"+
		"\5\36\20\2\u0103\u0104\5\"\22\2\u0104\u0105\5\26\f\2\u0105\u0107\5 \21"+
		"\2\u0106\u0108\5\60\31\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u010b\5&\24\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u0117\3\2\2\2\u010c\u010d\7\b\2\2\u010d\u010e\5\"\22\2\u010e"+
		"\u010f\5\26\f\2\u010f\u0111\7!\2\2\u0110\u0112\5\60\31\2\u0111\u0110\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0115\5&\24\2\u0114"+
		"\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u00fb\3\2"+
		"\2\2\u0116\u0102\3\2\2\2\u0116\u010c\3\2\2\2\u0117\21\3\2\2\2\u0118\u0119"+
		"\5,\27\2\u0119\u011a\5\24\13\2\u011a\u011b\5$\23\2\u011b\u0127\3\2\2\2"+
		"\u011c\u011d\5\36\20\2\u011d\u011e\5\"\22\2\u011e\u011f\5\24\13\2\u011f"+
		"\u0120\5$\23\2\u0120\u0127\3\2\2\2\u0121\u0122\7\b\2\2\u0122\u0123\5\""+
		"\22\2\u0123\u0124\5\24\13\2\u0124\u0125\5$\23\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0118\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u0121\3\2\2\2\u0127\23\3\2\2"+
		"\2\u0128\u0129\t\2\2\2\u0129\25\3\2\2\2\u012a\u012b\7H\2\2\u012b\27\3"+
		"\2\2\2\u012c\u012d\7D\2\2\u012d\31\3\2\2\2\u012e\u012f\t\3\2\2\u012f\33"+
		"\3\2\2\2\u0130\u0131\7-\2\2\u0131\35\3\2\2\2\u0132\u0133\t\4\2\2\u0133"+
		"\37\3\2\2\2\u0134\u0135\t\5\2\2\u0135!\3\2\2\2\u0136\u0137\t\6\2\2\u0137"+
		"#\3\2\2\2\u0138\u0139\t\7\2\2\u0139%\3\2\2\2\u013a\u013b\7+\2\2\u013b"+
		"\u013c\5\36\20\2\u013c\u013d\7\6\2\2\u013d\'\3\2\2\2\u013e\u013f\t\b\2"+
		"\2\u013f)\3\2\2\2\u0140\u0141\t\t\2\2\u0141+\3\2\2\2\u0142\u0143\7\34"+
		"\2\2\u0143-\3\2\2\2\u0144\u0145\7,\2\2\u0145/\3\2\2\2\u0146\u0147\7*\2"+
		"\2\u0147\61\3\2\2\2!:@FKMSZa\u0082\u0089\u0090\u0093\u009a\u009d\u009f"+
		"\u00af\u00b6\u00bd\u00c3\u00c5\u00cb\u00d2\u00d9\u00f9\u0100\u0107\u010a"+
		"\u0111\u0114\u0116\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}