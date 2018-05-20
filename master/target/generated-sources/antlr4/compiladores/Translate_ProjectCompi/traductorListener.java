// Generated from traductor.g4 by ANTLR 4.4
package compiladores.Translate_ProjectCompi;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link traductorParser}.
 */
public interface traductorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link traductorParser#sentence_aux}.
	 * @param ctx the parse tree
	 */
	void enterSentence_aux(@NotNull traductorParser.Sentence_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#sentence_aux}.
	 * @param ctx the parse tree
	 */
	void exitSentence_aux(@NotNull traductorParser.Sentence_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#aux_h}.
	 * @param ctx the parse tree
	 */
	void enterAux_h(@NotNull traductorParser.Aux_hContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#aux_h}.
	 * @param ctx the parse tree
	 */
	void exitAux_h(@NotNull traductorParser.Aux_hContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#oracion}.
	 * @param ctx the parse tree
	 */
	void enterOracion(@NotNull traductorParser.OracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#oracion}.
	 * @param ctx the parse tree
	 */
	void exitOracion(@NotNull traductorParser.OracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#aux_have_neg}.
	 * @param ctx the parse tree
	 */
	void enterAux_have_neg(@NotNull traductorParser.Aux_have_negContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#aux_have_neg}.
	 * @param ctx the parse tree
	 */
	void exitAux_have_neg(@NotNull traductorParser.Aux_have_negContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#present_s}.
	 * @param ctx the parse tree
	 */
	void enterPresent_s(@NotNull traductorParser.Present_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#present_s}.
	 * @param ctx the parse tree
	 */
	void exitPresent_s(@NotNull traductorParser.Present_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#aux}.
	 * @param ctx the parse tree
	 */
	void enterAux(@NotNull traductorParser.AuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#aux}.
	 * @param ctx the parse tree
	 */
	void exitAux(@NotNull traductorParser.AuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#present_contneg}.
	 * @param ctx the parse tree
	 */
	void enterPresent_contneg(@NotNull traductorParser.Present_contnegContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#present_contneg}.
	 * @param ctx the parse tree
	 */
	void exitPresent_contneg(@NotNull traductorParser.Present_contnegContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#simple_presentneg}.
	 * @param ctx the parse tree
	 */
	void enterSimple_presentneg(@NotNull traductorParser.Simple_presentnegContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#simple_presentneg}.
	 * @param ctx the parse tree
	 */
	void exitSimple_presentneg(@NotNull traductorParser.Simple_presentnegContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#per_pro}.
	 * @param ctx the parse tree
	 */
	void enterPer_pro(@NotNull traductorParser.Per_proContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#per_pro}.
	 * @param ctx the parse tree
	 */
	void exitPer_pro(@NotNull traductorParser.Per_proContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#past_part}.
	 * @param ctx the parse tree
	 */
	void enterPast_part(@NotNull traductorParser.Past_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#past_part}.
	 * @param ctx the parse tree
	 */
	void exitPast_part(@NotNull traductorParser.Past_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#to_be}.
	 * @param ctx the parse tree
	 */
	void enterTo_be(@NotNull traductorParser.To_beContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#to_be}.
	 * @param ctx the parse tree
	 */
	void exitTo_be(@NotNull traductorParser.To_beContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#present_c}.
	 * @param ctx the parse tree
	 */
	void enterPresent_c(@NotNull traductorParser.Present_cContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#present_c}.
	 * @param ctx the parse tree
	 */
	void exitPresent_c(@NotNull traductorParser.Present_cContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#sentence_p}.
	 * @param ctx the parse tree
	 */
	void enterSentence_p(@NotNull traductorParser.Sentence_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#sentence_p}.
	 * @param ctx the parse tree
	 */
	void exitSentence_p(@NotNull traductorParser.Sentence_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#verbsg}.
	 * @param ctx the parse tree
	 */
	void enterVerbsg(@NotNull traductorParser.VerbsgContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#verbsg}.
	 * @param ctx the parse tree
	 */
	void exitVerbsg(@NotNull traductorParser.VerbsgContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#adjetives}.
	 * @param ctx the parse tree
	 */
	void enterAdjetives(@NotNull traductorParser.AdjetivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#adjetives}.
	 * @param ctx the parse tree
	 */
	void exitAdjetives(@NotNull traductorParser.AdjetivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#auxdont}.
	 * @param ctx the parse tree
	 */
	void enterAuxdont(@NotNull traductorParser.AuxdontContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#auxdont}.
	 * @param ctx the parse tree
	 */
	void exitAuxdont(@NotNull traductorParser.AuxdontContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#verbs}.
	 * @param ctx the parse tree
	 */
	void enterVerbs(@NotNull traductorParser.VerbsContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#verbs}.
	 * @param ctx the parse tree
	 */
	void exitVerbs(@NotNull traductorParser.VerbsContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#compl}.
	 * @param ctx the parse tree
	 */
	void enterCompl(@NotNull traductorParser.ComplContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#compl}.
	 * @param ctx the parse tree
	 */
	void exitCompl(@NotNull traductorParser.ComplContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#aux_sentneg}.
	 * @param ctx the parse tree
	 */
	void enterAux_sentneg(@NotNull traductorParser.Aux_sentnegContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#aux_sentneg}.
	 * @param ctx the parse tree
	 */
	void exitAux_sentneg(@NotNull traductorParser.Aux_sentnegContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#part_sentneg}.
	 * @param ctx the parse tree
	 */
	void enterPart_sentneg(@NotNull traductorParser.Part_sentnegContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#part_sentneg}.
	 * @param ctx the parse tree
	 */
	void exitPart_sentneg(@NotNull traductorParser.Part_sentnegContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#tobe_neg}.
	 * @param ctx the parse tree
	 */
	void enterTobe_neg(@NotNull traductorParser.Tobe_negContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#tobe_neg}.
	 * @param ctx the parse tree
	 */
	void exitTobe_neg(@NotNull traductorParser.Tobe_negContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#nouns_sp}.
	 * @param ctx the parse tree
	 */
	void enterNouns_sp(@NotNull traductorParser.Nouns_spContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#nouns_sp}.
	 * @param ctx the parse tree
	 */
	void exitNouns_sp(@NotNull traductorParser.Nouns_spContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#articles}.
	 * @param ctx the parse tree
	 */
	void enterArticles(@NotNull traductorParser.ArticlesContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#articles}.
	 * @param ctx the parse tree
	 */
	void exitArticles(@NotNull traductorParser.ArticlesContext ctx);
	/**
	 * Enter a parse tree produced by {@link traductorParser#aux_neg}.
	 * @param ctx the parse tree
	 */
	void enterAux_neg(@NotNull traductorParser.Aux_negContext ctx);
	/**
	 * Exit a parse tree produced by {@link traductorParser#aux_neg}.
	 * @param ctx the parse tree
	 */
	void exitAux_neg(@NotNull traductorParser.Aux_negContext ctx);
}