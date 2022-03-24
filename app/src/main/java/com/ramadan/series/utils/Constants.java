package com.ramadan.series.utils;

import com.ramadan.series.R;
import com.ramadan.series.models.ChannelItem;
import com.ramadan.series.models.RamadanItem;

import java.util.Arrays;
import java.util.List;

public class Constants {
    public static final String RAMADAN_SERIES_KEY = "RAMADAN_SERIES_KEY";
    public static final String RAMADAN_SERIES_ALARM_TIME = "RAMADAN_ALARM_TIME";


    public static List<RamadanItem> ramadanList =
            Arrays.asList(/*new RamadanItem(R.drawable.ic_launcher_background, "Title 1", " Brief 1", getRandomChannel()),*/
                    new RamadanItem(R.drawable.rag3inyahwa, "راجعين يا هوى", "في إطار درامي، تتناول قصة المسلسل حياة رجل أعمال متعدد العلاقات النسائية، وتقع الفتيات في شباكه والذي يوهمهن بالحب، وعلى الرغم من غروره إلا أنه دائم الإيقاع بهن.\n" +
                            "\n", Arrays.asList(new ChannelItem(R.drawable.channel_mbc_masr, Arrays.asList("13:00 PM", "22:00 PM", "06:00 AM"))
                            , new ChannelItem(R.drawable.channel_mbc_masr2, Arrays.asList("15:00 PM", "00:00 AM", "08:00 AM"))
                            , new ChannelItem(R.drawable.channel_mbc_masr2, Arrays.asList("15:00 PM", "00:00 AM", "08:00 AM")))),
                    new RamadanItem(R.drawable.el_ser, "السر", " تدور الأحداث حول محامية لها علاقة برجل أعمال، تكتشف سر خطير بخصوصه، مما يؤدي إلى وقوع العديد من الخلافات بينهما، فيحاول السيطرة والقضاء عليها باستخدام السلطة والنفوذ، فهل سينجح؟.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.enhraf, "إنحراف", " المسلسل مأخوذ عن أحداث حقيقية، تدور فى دراما تشويقية مليئة بالغموض، حول انحراف عدد من الشخصيات عن الطبيعة البشرية؛ يصطدمون بطبيبة نفسية وتقرر تعديل المسار بطريقتها الخاصة.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.uturn, "يوتيرن", " لا يوجد", getRandomChannel()),
                    new RamadanItem(R.drawable.elmeshwar, "المشوار", " اكيد قصة كفاح", getRandomChannel()),
                    new RamadanItem(R.drawable.choice, "الاختيار 3", " لا يوجد", getRandomChannel()),
                    new RamadanItem(R.drawable.ahlamsa3ida, "أحلام سعيدة", " تحمل قصة مسلسل أحلام سعيدة بطولة يسرا الكثير من المفاجآت والقضايا الهامة التي تناقشها في إطار درامي، لتتناغم القوة الناعمة المسيطرة على أحداث المسلسل وتأخذك معها في رحلة خاصة مليئة بالمغامرات الاجتماعية والكوميديا.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.dayman3amer, "دايما عامر", " و تدور قصة و أحداث مسلسل دايما عامر حول مناقشة قضية هامة تشغل الراى العام و كل البيوت المصرية و هى مشكلة التعليم في مصر خاصة المشاكل التى ظهرت في الفترة الاخيرة في المدارس و محاول الوقوف عليها و مناقشتها و وضع بعض الحلول لها و يناقش العمل عدد من المشكلات التى تواجه الطلاب في مراحل التعليم المختلفة .\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.el3a2doon, "العائدون", " لا يوجد", getRandomChannel()),
                    new RamadanItem(R.drawable.rag3inyahwa, "راجعين يا هوى", " في إطار درامي، تتناول قصة المسلسل حياة رجل أعمال متعدد العلاقات النسائية، وتقع الفتيات في شباكه والذي يوهمهن بالحب، وعلى الرغم من غروره إلا أنه دائم الإيقاع بهن.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.mlfsry, "ملف سري", " لا يوجد", getRandomChannel()),
                    new RamadanItem(R.drawable.suits, "سوتس", " تدور أحداث المسلسل حول آدم منصور وزين ثابت،، واللذين يتعرفا على بعضهما في وقت مبكرًا ليخوضا تحديات صعبة لحل القضايا.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.toba, "توبة", " بعد أن ترك ماضيه المشين وقرر الاستقرار في مدينة جديدة لبدء حياة نظيفة، تنقلب حياة الشاب توبة عندما ينكشف سره مع ظهور شخص من ماضيه واتحاده مع ألد أعدائه.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.mktoob3lia, "مكتوب عليا", " لا يوجد", getRandomChannel()),
                    new RamadanItem(R.drawable.gzirtel3mam, "جزيرة غمام", " تدور أحداث المسلسل في فترة العشرينات من القرن ال20 وتدور احداثه في إطار صعيدي ويناقش صراع الأخوة، والمشاكل التي تحدث بيهم", getRandomChannel()),
                    new RamadanItem(R.drawable.raniawskina, "رانيا وسكينة", " ينتمى مسلسل رانيا و سكينة الي نوعية الأعمال الدرامية الاجتماعية التشويقية و الكوميدية أيضا و تدور أحداثها حول رجل أعمال يمتلك عدد من الشركات و لديه ثروة كبيرة و لديه ابنة واحدة و في احد الأيام يتوفى\n", getRandomChannel()),
                    new RamadanItem(R.drawable.aalmtani, "عالم تاني", " تدور احداث المسلسل حول فكرة لو علمتم الغيب لاخترتم الواقع حيث تتعرض «نغم» عازفة البيانو لحادث يغير حياتها رأسا على عقب لتصل لمرحلة من مراحل الشفافية الروحية، وتسقط الاقنعة عن اقرب الناس اليها سواء كان زوج او صديقة او اخ، فهي اشبه بعصفورة تحارب وحوش كاسرة فهل ستنجح في هزيمة الوحوش؟ هذا التساؤل ستجيب عنه الأحداث وتحدده قدرتها على الاحتمال.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.btlo3elro7, "بطلوع الروح", " بعد أن يخدعها زوجها ويستدرجها من مصر إلى وكر لداعش في سوريا، تحاول روح النفاد بريشها لينتهي بها المطاف في معكسر للهاربات من التنظيم، وتمسي العودة لمصر حلما بعيدا.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.azmtmontasfel3omr, "أزمة منتصف العمر", " في إطار اجتماعي درامي، يستعرض العمل قصة فتاة متزوجة ولديها ابنة وتنشأ علاقة حب بين ابنتها وبين أحد الشباب.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.mon7na5tr, "منحنى خطر", " المسلسل ينتمي الى نوعية الغموض والتشويق حول شخصية «سيف» الذي يجد نفسه متورطا في قضية قتل اقرب الناس اليه ويحكم عليه بالإعدام وطوال احداث المسلسل يبحث سيف عن حل لغز هذه القضية\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.meenkal, "مين قال؟", " على الرغم من نجاح شريف في الثانوية العامة بمعدل يؤهله لدخول كلية الهندسة التي يحلم ذويه بارتيادها، إلا أنه يطمح بامتلاك مشروعه المتمثل بصناعة مقاعد من الورق.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.wgooh, "وجوه", " مسلسل درامي، يتكون من ثلاث قصص، كل قصة تدور أحداثها في خمسة عشر حلقة ومن تلك القصص حكاية وش تالت، بطولة حنان مطاوع.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.elmda7elgoz2eltani, "المداح ج 2 (أسطورة الوادي)", " حلم غريب يراود صابر المداح يغير مسار حياته، وعندما يحاول البحث عن تفسير له، يجد نفسه على أعتاب حرب سيخوضها مع الجن.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.elkbeerelgoz2elsads, "الكبير أوي ج6", " لا يوجد", getRandomChannel()),
                    new RamadanItem(R.drawable.pablo, "بابلو", " سيد حسن، المعروف باسم \"بابلو\"، توفي والديه وهو صغير وعاش ظروف قاسية و لكنه و على الرغم من ذلك استطاع مواجهة الحياة بكل ظروفها ولمع اسمه، وأصبح الكل يعرفه بسبب مساعدته للمحتاجين ، حسن الشاب المكافح الذي يبدأ رحلة صراع طويلة مع عصابة تتاجر بالبشر يخوض من خلالها العديد من المواقف التي يظهر من خلالها معدنه الحقيقي.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.sho3l3ali, "شغل عالي", " في إطار كوميدي يدور المسلسل حول صديقتين (فيفي عبده وشيرين رضا) تتعرضان للعديد من المفارقات الكوميدية فيما بينهما.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.febetnarobot, "في بيتنا روبوت ج2", " في إطار خيالي كوميدي، يستكمل الجزء الثاني قصة مهندس البرمجيات يوسف الذي طور نموذجين من البشر الآليين، وهما زومبا ولذيذ، ليقوما بمساعدته في شركته ومساعدة زوجته سارة في الأعمال المنزلية.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.beetelshda, "بيت الشدة", " لا يوجد", getRandomChannel()),
                    new RamadanItem(R.drawable.wakala5artoosh, "وكالة الخرطوشي", " تدور احداث المسلسل في إطار درامي حول مرض الفوبيا، من خلال تسليط الضوء على عدد من الأشخاص الذين يعانون من هذا المرض، وأهم ما يواجههم من مشاكل.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.dobamin, "دوبامين", " لا يوجد", getRandomChannel()),
                    new RamadanItem(R.drawable.wrd, "ورد", " المسلسل تدور أحداثه فى إطار اجتماعي، وتتعرض ورد (حنان مطاوع) خلاله العديد من الضغوطات والصعوبات المتتالية، حيث تقع فى حب رجلين الاول رجل الأعمال (نضال الشافعى) والثاني المحامى (محمد عز)\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.ywmiatzogamfroosagoz5, "يوميات زوجة مفروسة أوي ج5", " لا يوجد", getRandomChannel()),
                    new RamadanItem(R.drawable.mzadelshar, "مزاد الشر", " لا يوجد", getRandomChannel()),
                    new RamadanItem(R.drawable.awdtelapeldal, "عودة الأب الضال", " رجل أعمال ثرى يمتلك فندق كبير، ويقع في أزمة، ولكي يخرج منها ويحاول البحث عن أبنائه الـ 7 منهم من تعمل راقصة، وأخرى محامية، وبائعة كبدة، وبلوجر، وطبيبة، وتاجر فاكهة، وفى نفس الوقت تحاول أكثر من سيدة الزواج منه للنصب عليه والاستيلاء على الفندق.\n" +
                            "\n", getRandomChannel()),
                    new RamadanItem(R.drawable.wlad3abd, "ولاد عابد", " لا يوجد", getRandomChannel()));

    private static List<ChannelItem> getRandomChannel() {
        return Arrays.asList(new ChannelItem(R.drawable.channel_mbc_masr, Arrays.asList("10:00 PM", "17:00 PM", "00:00 AM")),
                new ChannelItem(R.drawable.channel_mbc_masr2, Arrays.asList("12:00 PM", "19:00 PM", "02:00 AM")),
                        new ChannelItem(R.drawable.channel_cbc_drama, Arrays.asList("14:00 PM", "22:00 PM")));
    }

}
