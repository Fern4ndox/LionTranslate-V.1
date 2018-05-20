grammar traductor;

oracion
:	 present_s|present_c|sentence_aux|sentence_p|simple_presentneg| present_contneg|part_sentneg|aux_sentneg
;
present_s
:
	articles nouns_sp verbs (compl)? |POSS_ADJ nouns_sp verbs (compl)?| per_pro verbs (compl)?
;
//Reglas BNF
//Presente Continuo
present_c:
per_pro to_be verbsg (compl)? | articles nouns_sp to_be verbsg (compl)?|POSS_ADJ nouns_sp to_be verbsg (compl)?|
per_pro to_be ART_INDEF CONC_NOUNS| per_pro to_be adjetives|articles nouns_sp to_be adjetives| POSS_ADJ nouns_sp to_be adjetives|articles nouns_sp to_be verbsg ADJ|
POSS_ADJ nouns_sp to_be verbsg ADJ;
//Sentencia Participio
sentence_p:
per_pro aux_h past_part verbsg (compl)?|articles nouns_sp aux_h past_part (verbsg)? (compl)?|POSS_ADJ nouns_sp aux_h PAST_PARTICIPLE_VERBS_IRREGULAR (verbsg)? (compl)?
;
//Sentencia Auxiliar
sentence_aux:
per_pro aux verbs|articles nouns_sp aux verbs|POSS_ADJ nouns_sp aux verbs
;
//Presente Simple Negativo
simple_presentneg
:
	articles nouns_sp auxdont verbs (compl)? |POSS_ADJ nouns_sp auxdont verbs (compl)?| per_pro auxdont verbs (compl)?
;
//Presente Continuo Negativo
present_contneg:
per_pro tobe_neg verbsg (compl)? | articles nouns_sp tobe_neg verbsg (compl)?|POSS_ADJ nouns_sp tobe_neg verbsg (compl)?|
per_pro tobe_neg ART_INDEF CONC_NOUNS| per_pro tobe_neg adjetives|articles nouns_sp tobe_neg adjetives| POSS_ADJ nouns_sp tobe_neg adjetives|articles nouns_sp tobe_neg verbsg ADJ|
POSS_ADJ nouns_sp tobe_neg ADJ
;
//Sentencia Participio Negativo
part_sentneg:
per_pro aux_have_neg past_part verbsg (compl)?|articles nouns_sp aux_have_neg past_part (verbsg)? (compl)?|POSS_ADJ nouns_sp aux_have_neg PAST_PARTICIPLE_VERBS_IRREGULAR (verbsg)? (compl)?
;
//Sentencia Auxiliar Negativo
aux_sentneg:
per_pro aux_neg verbs|articles nouns_sp aux_neg verbs|POSS_ADJ nouns_sp aux_neg verbs
;
//Auxiliar Negativo
aux_neg:WOULDNT|CANT|SHOULDNT;
//Auxiliar "Tener" Negativo
aux_have_neg:AUXHAVE;
//Auxiliar "Don't"
auxdont:AUXDONT;
//Regla Adjetivos
adjetives:CAL_CMN_ADJ|CAL_COLOR_ADJ|CAL_CONDITION_ADJ|CAL_PERSONALITY_POSITIVE_ADJ
|CAL_PERSONALITY_NEGATIVE_ADJ| CAL_SIZE_ADJ|CAL_SOUND_ADJ|CAL_TIME_ADJ|CAL_TASTETOUCH_ADJ
|CAL_TOUCH_ADJ|CAL_QUANTITY_ADJ;
//Ser o Estar Negado
tobe_neg:TO_BE_NEG;
//Regla Articulos
articles:ART_DEF | ART_INDEF;
//Participio Pasado
past_part:PAST_PARTICIPLE_REGULAR_VERBS|PAST_PARTICIPLE_VERBS_IRREGULAR;
//Sustantivos Presente Simple
nouns_sp:CONC_NOUNS|COM_NOUNS;
//Verbos
verbs:REG_VERBS|IRRE_VERBS;
//Complemento
compl:PREPS articles PLACES;
aux_h: HAVE | HAS;
aux: WOULD|CAN|SHOULD;
per_pro:PER_PRONOUNS;
to_be:TO_BE;
verbsg: GERUNDS;

//Tokens
ABST_NOUNS:'beauty'|'bravery'|'brilliance'|'brutality'|'charity'|'coldness'|'compassion'|
'confidence'|'contentment'|'courage'|'curiosity'|'dedication'|'determination'|'ego'|'elegance'|'enthusiasm'|
'envy'|'evil'|'fear'|'generosity'|'goodness'|'graciousness'|'hatred'|'honesty'|'honor'|'hope'|'humility'|'humor'|
'insanity'|'integrity'|'intelligence'|'jealousy'|'kindness'|'loyalty'|'maturity'|'patience'|'perseverance'|'sanity'|'self-control'|
'sensitivity'|'sophistication'|'stupidity'|'sympathy'|'talent'|'tolerance'|'trust'| 'warmth'|'weakness'|'wisdom'|'wit';
CONC_NOUNS:'student'|'fire fighter'|'pencil'|'computer'|'road'|'toddler'|'yardstick'|'egg'|'sponge';

COM_NOUNS:'boy'|'girl'|'train'|'car'|'motorcycle'|'mouse'|'dog'|'cow'|'horse'|'goat'|'frog'|'toad'|'chair'
|'giraffe'|'pen'|'phone'|'ant'|'bird'|'bed'|'screen'|'desk'|'notebook'|'donkey'|'tree'
|'mom'|'dad'|'uncle'|'brother'|'sister'|'son'|'aunt'|'grandmother'|'grandfather'|'daughter'|'nephew'
|'niece'|'wife'|'shirt'|'pants'|'shoe'|'sock'|'bottle'|'nail'|'hair'|'eye'|'ear'|'nose'|'mouth'|'finger'
|'neck'|'chin'|'table'|'wallet'|'cap'|'hat'|'cat'|'game';

PLACES: 'house' | 'park' | 'city' | 'country' | 'airport' | 'amusement park' | 'cateen' | 'casino'|'church'|'cinema'|'convent'|'dairy'|'disco'|'drugstore'|'fire station'| 'art gallery'|'bus station'|'cathedra' |'beauty parlor' | 'bank'|'court'|'castle'|'factory'|'hospital'|'hotel'|'jail'|'library'|'market'|
'museum'|'office'|'pet shop'|'school'|'train station'|'zoo'|'university';

UNCOUNT_NOUNS:'tea'|'sugar'|'water'|'air'|'rice'|'knowledge'|'anger'|'money'|'research'|'safety'|'evidence';

POSS_ADJ: 'my'|'our'|'your'|'their'|'his'|'her'|'its';

ADJ: 'me'|'you'|'them'|'us';

DEMOST_ADJ: 'these'|'those'|'that'|'this';

CAL_CMN_ADJ: 'good' |'new'|'last'|'own'| 'other'|'different' |'small'| 'next'|'important'|'public'| 'same'| 'able';

CAL_COLOR_ADJ: 'red'| 'orange'| 'yellow'| 'green'| 'blue' |'purple'|'gray'| 'black'| 'white'| 'pink'| 'skyblue';

CAL_CONDITION_ADJ: 'alive' |'better'| 'careful'| 'clever'| 'dead'| 'easy' |'famous'| 'gifted' |'helpful'| 'important' |'inexpensive'|'mushy'| 'odd' |'powerful'| 'rich'| 'shy'| 'tender'| 'uninterested'| 'vast'| 'wrong';

CAL_PERSONALITY_POSITIVE_ADJ: 'agreeable' | 'brave' | 'calm' | 'delightful' | 'eager' | 'faithful' | 'gentle' | 'happy' | 'jolly' | 'kind' |'lively' | 'nice' | 'obedient' | 'proud' | 'relieved' | 'silly' | 'thankful' | 'victorious' | 'witty' | 'zealous';    

CAL_PERSONALITY_NEGATIVE_ADJ: 'angry'|'bewildered'|'clumsy'|'defeated'|'embarrassed'|'fierce'|'grumpy'|'helpless'|'itchy'|'jealous'|'lazy'|'repulsive'|'mysterious'|'scary'|'nervous'|'thoughtless'|'obnoxious'|'uptight'|'panicky'|'worried';

CAL_SHAPE_ADJ:'broad'|'narrow'|'chubby'|'round'|'shallow'|'curved'|'skinny'|'deep'|'square'|'flat'|'steep'|'high'|'straight'|'hollow'|'wide'|'low';

CAL_SIZE_ADJ:'big'|'miniature'|'colossal'|'petite'|'fat'|'puny'|'gigantic'|'scrawny'|'great'||'immense'|'tall'|'large'|'teeny'|'little'|'teeny-tiny'|'mammoth'|'tiny'|'massive';

CAL_SOUND_ADJ: 'cooing'|'purring'|'deafening'|'quiet'|'faint'|'raspy'|'hissing'|'screeching'|'loud'|'thundering'|'melodic'|'voiceless'|'noisy'|'whispering';

CAL_TIME_ADJ:'ancient'|'old_fashioned'|'brief'|'quick'|'early'|'rapid'|'fast'|'short'|'late'|'slow'|'long'|'swift'|'modern'|'young'|'old';

CAL_TASTETOUCH_ADJ: 'bitter'|'rotten'|'delicious'|'salty'|'fresh'|'sticky'|'greasy'|'strong'|'juicy'|'sweet'|'hot'|'tart'|'icy'|'tasteless'|'loose'|'uneven'|'melted'|'weak'|'nutritious'|'wet'|'prickly'|'wooden'|'rainy'|'yummy';

CAL_TOUCH_ADJ:'boiling'|'damp'|'breeze'|'dirty'|'broken'|'dry'|'bumpy'|'dusty'|'chilly'|'filthy'|'cold'|'flaky'|'cool'|'fluffy'|'creepy'|'freezing'|'crooked'|'hot'|'cuddly'|'warm'|'curly'|'wet'|'damaged';

CAL_QUANTITY_ADJ:'abundant'|'light'|'empty'|'many'|'few'|'numerous'|'full'|'sparse'|'heavy'|'substantial';

ORD_NUMBERS:'one'|'two'|'three'|'four'|'five'|'six'|'seven'|'eight'|'nine'|'ten'|'eleven'|'twelve'|'thirteen'|'fourteen'|'fifteen'|'sixteen'|'seventeen'|'eighteen'|'nineteen'|'twenty'|'twenty-one'|'twenty-two'|'twenty-three'|'twenty-four'|'twenty-five'|'twenty-six'|'twenty-seven'|'twenty-eight'|'twenty-nine'|'thirty'|'forty'|'fifty'|'sixty'|'seventy'|'eighty'|'ninety'|'one hundred'|'two hundred'|'three hundred'|'four hundred'|'five hundred'|'six hundred'|'seven hundred'|'eight hundred'|'nine hundred'|'one thousand';

CARD_NUMBERS: 'first'|'second'|'third'|'fourth'|'fifth'|'sixth'|'seventh'|'eighth'|'ninth'|'tenth'|'eleventh'|'twelfth'|'thirteenth'|'fourteenth'|'fifteenth'|'sixteenth'|'seventeenth'|'eighteenth'|'nineteenth'|'twentieth'|'twenty-first'|'twenty-second'|'twenty-third'|'twenty-fourth'|'twenty-fifth'|'twenty-sixth'|'twenty-seventh'|'twenty-eighth'|'twenty-ninth'|'thirtieth'|'fourtieth'|'fiftieth'|'sixtieth'|'seventieth'|'eightieth'|'ninetieth'|'one hundredth'|'two hundredth';

UND_ADJ: 'all'|'any'|'both'|'each'|'either'|'few'|'less'|'little'|'much'|'more'|'many'|'one'|'other'|'others'|'several'|'some'|'such';

ART_DEF: 'the';

ART_INDEF: 'a'|'an';

PER_PRONOUNS: 'i'|'you'|'we'|'they'|'he'|'she'|'it';

DEM_PRONOUN: 'such'|'none'|'one'|'ones';

INTERR_PRONOUNS:'who'|'whom'|'what'|'whose'|'which'|'how';

REG_VERBS: 'accept' | 'add' | 'agree' | 'answer' | 'apologize' | 'appear' | 'ask' | 'believe' | 'belong' | 'call' | 'change' | 'close' | 'compare' | 'copy' | 
'cry' | 'dance' | 'decide' | 'discover' | 'dry' | 'end' | 'enjoy' | 'explain' | 'finish' | 'guess' | 'happen' | 'help' | 'hurry' | 'imagine' | 'increase' | 'include' | 'invite' | 
'jump' | 'kill' | 'kiss' | 'laugh' | 'lie' | 'listen' | 'live' | 'love' | 'move' | 'open' | 'play' | 'produce' | 'pull' | 'rain' | 'reach' | 'remember' | 'return' | 'save' | 'smile' | 'stop' |
'talk' | 'touch' | 'thank' | 'translate' | 'travel' | 'visit' | 'wait' | 'walk' | 'want' | 'wash' | 'work' | 'worry';

IRRE_VERBS: 'eat'|'be' | 'become'| 'bite'  | 'break'  | 'buy' | 'choose'  | 'come' | 'cost' | 'cut' | 'do' | 'fall' | 'feel' | 'find'| 'forget' | 'get' | 'give'| 'go'  | 'have'  | 'hold'| 'know' | 'learn'  | 'let' | 'lose'  | 'make' | 'meet' | 'mistake'| 'pay' | 'put' | 'read' | 'say'  | 'sell' | 'show' | 'sing' | 'sleep'  | 
'speak'  | 'swim'| 'take'  | 'teach' | 'tell'  | 'think'  | 'understand'  | 'win';

PAST_PARTICIPLE_VERBS_IRREGULAR: 'been'|'become'|'bitten'|'broken'|'bought'|'chosen'|'come'|'cost'|'cut'|'done'|'fallen'|'felt'|'found'|'forgotten'|'got'|'gotten'|'given'|'gone'|'had'|'held'|'known'|'let'|'lost'|'made'|'met'|'paid'|'put'|'read'|'said'|'sold'|'shown'|'showed'|'sung'|'slept'|
'swum'|'taken'|'taught'|'told'|'thought'|'understood'|'won';

PAST_PARTICIPLE_REGULAR_VERBS: 'accepted' | 'added' | 'agreed' | 'answered' | 'apologized' | 'appeared' | 'asked' | 'believed' | 'belonged' | 'called' | 'changed' | 'closed' | 'compared' | 
'copied' | 'cried' | 'danced' | 'decided' | 'discovered' | 'dried' | 'ended' | 'enjoyed' | 'explained' | 'finished' | 'guessed' | 'happened' | 'helped' | 'hurried' | 'imagined' | 'increased' | 
'included' | 'invited' | 'jumped' | 'killed' | 'kissed' | 'laughed' | 'lied' | 'listened' | 'lived' | 'loved' | 'moved' | 'opened' | 'played' | 'produced' | 'pulled' | 'rained' | 'reached' | 'remembered' 
| 'returned' | 'saved' | 'smiled' | 'stopped' |'talked' | 'touched' | 'thanked' | 'translated' | 'traveled' | 'visited' | 'waited' | 'walked' | 'wanted' | 'washed' | 'worked' | 'worried';

ADV_TIME:'now'|'yesterday'|'the day before yesterday'|'today'|'tomorrow'|'before'|'last night'|'still'|'neverless'|'when'|'afterwards'|'then'|'never'|'later'|'never'|'first'|'always'|'late'|'still'|'yet'|'already';

ADV_PLACE:'here'|'there'|'over there'|'outside'|'up'|'upstairs'|'back'|'close'|'below'|'under'|'underneath'|'where';

ADV_QUANTITY:'something'|'anything'|'nothing'|'hardly'|'enough'|'almost'|'how much'|'too much'|'more'|'less'|'much'|'a lot of'|'little'|'all'|'every'|'entire'|'only'|'half'|'so'|'so much';

ADV_MODE: 'in this way'|'like this'|'well'|'bad'|'almost'|'how'|'slowly'|'quick'|'fast'|'slow'|'fast';

AFFIRM_ADVERBS:'if'|'of course'|'exact'|'right'|'really'|'certainly'|'surely'|'fair'|'just'|'right'|'already';

NEG_ADVERBS:'no'|'never'|'either'|'neither'|'ever';

ADV_DOUBT: 'perhaps'|'maybe'|'probably';

GERUNDS:'playing'|'eating'| 'accepting' | 'adding' | 'agreeing' | 'answering' | 'apologizing' | 'appearing' | 'asking' | 'believing' | 'belonging' | 'calling' | 'changing'| 'closing'|'comparing'|'copying'|'crying' | 'dancing' | 'deciding' | 'discovering' | 'drying' | 'ending' | 'enjoying' | 'explaining' | 'finishing' | 'guessing' | 'happening' | 'helping' | 'hurrying' | 'imagining' | 'increasing' | 'including' | 'inviting' |'jumping' | 'killing' | 'kissing' | 'laughing' | 'lying' | 'listening' | 'living' | 'loving' | 'moving' | 'opening' | 'playing' | 'producing' | 'pulling' | 'raining' | 'reaching' | 'remembering' | 'returning' | 'saving' | 'smiling' | 'stoping' |'talking' | 'touching' | 'thanking' | 'translating' | 'traveling' | 'visiting' | 'waiting' | 'walking' | 'wanting' | 'washing' | 'working' | 'worrying';

PREPS:'in'|'after'|'at'|'behind'|'beneath'|'between'|'by'|'except'|'from'|'from'|'into'|'near'|'off'|'over'|'trought'|'till'|'until'|'under'|'upon'|'above'|'among'|'before'|'among'|'before'|'below'|'beside'|'but'|'down'|'for'|'like'|'of'|'on'|'since'|'to'|'up'|'with';

TO_BE: 'is'|'am'|'are';

TO_BE_NEG: 'isnt'|'arent'|'is not'|'are not'|'am not';

CONJ: 'or' | 'and' | 'but' | 'so';

CONJ_COP:'and'|'also'|'too'|'as'|'well'|'as well as'|'both'|'not only'|'but also';

CONJ_ADV: 'but'|'nevertheless'|'however'|'whereas'|'only'|'still';

CONJ_DIST: 'after'|'although'|'as'|'because'|'before'|'how'|'if'|'once'|'since'|'then'|'though'|'till'|'until'|'when'|'where'|'whether'|'while';

CONJ_DISYU: 'or';

CONJ_EXPLI: 'and'|'but'|'or'|'nor'|'either'|'neither'|'yet'|'not only'|'but also'|'both and';

CONJU_SUB: 'after' | 'as' | 'because' | 'before' | 'while' | 'since' | 'unless' | 'until' | 'when'; 

COORD_CONJUNCTIONS:'for'|'and'|'nor'|'but'|'or'|'yet'|'so';

CONJ_CON:'if'|'whether'|'unless'|'provided'|'providing'|'as long as'|'in case';

CONJ_CAS: 'because'|'for'|'because of'|'since'|'as'|'due to'|'owing to';

CONJ_CONSE: 'although'|'though'|'even though'|'even if'|'not even if'|'despite'|'in spite of'|'regardless';

CONJ_COMP: 'than'|'as'|'a lost'|'a little'|'the';

CONJ_FIN: 'therefore'|'hence'|'thus'|'so'|'consequently';

INTERJECT: 'wow' | 'yuck' | 'ouch' | 'uh-huh' | 'oops' | 'hey' | 'yeah' | 'eh';

//CONTRACT: 'i´m' | 'you´re' | 'he´s' | 'she´s' | 'it´s' | 'we´re' | 'they´re';

SIGNS: '.' | ',' | '!'| '?' | ':' | ';' | '...' | '-' | '_' | '(' | ')' | '{' | '}' | '[' |  ']' |  '<' | '>' | '"' | '`' | '´'; 

DO:'do';

DOES:'does';

WOULD:'would';

CAN: 'can';

SHOULD: 'should';

HAVE:'have';

HAS:'has';

AUXDONT:'dont'|'doesnt'|'do not'|'does not';

WOULDNT:'wouldnt'|'would not';

CANT:'cant'|'can not';

SHOULDNT:'shouldnt'|'should not';

AUXHAVE:'havent'|'hasnt'|'have not'|'has not';


WS
:
	[ \t\r\n]+ -> skip
;