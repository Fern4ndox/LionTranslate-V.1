// Generated from compiladores\Translate_ProjectCompi\traductor.g4 by ANTLR 4.5.1
package compiladores.Translate_ProjectCompi;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link traductorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface traductorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link traductorParser#oracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOracion(traductorParser.OracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#present_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresent_s(traductorParser.Present_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#present_c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresent_c(traductorParser.Present_cContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#sentence_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence_p(traductorParser.Sentence_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#sentence_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence_aux(traductorParser.Sentence_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#simple_presentneg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_presentneg(traductorParser.Simple_presentnegContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#present_contneg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPresent_contneg(traductorParser.Present_contnegContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#part_sentneg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart_sentneg(traductorParser.Part_sentnegContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#aux_sentneg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux_sentneg(traductorParser.Aux_sentnegContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#aux_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux_neg(traductorParser.Aux_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#aux_have_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux_have_neg(traductorParser.Aux_have_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#auxdont}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxdont(traductorParser.AuxdontContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#adjetives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjetives(traductorParser.AdjetivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#tobe_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTobe_neg(traductorParser.Tobe_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#articles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticles(traductorParser.ArticlesContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#past_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPast_part(traductorParser.Past_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#nouns_sp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNouns_sp(traductorParser.Nouns_spContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#verbs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbs(traductorParser.VerbsContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#compl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompl(traductorParser.ComplContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#aux_h}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux_h(traductorParser.Aux_hContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux(traductorParser.AuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#per_pro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPer_pro(traductorParser.Per_proContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#to_be}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_be(traductorParser.To_beContext ctx);
	/**
	 * Visit a parse tree produced by {@link traductorParser#verbsg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbsg(traductorParser.VerbsgContext ctx);
}