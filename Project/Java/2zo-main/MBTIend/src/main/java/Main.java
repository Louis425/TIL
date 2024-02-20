import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Test test = new Test();

            System.out.println("이름");
            test.name = sc.next();
            System.out.println("성별");

            test.age = sc.next();
            System.out.println(test.name + "이시군요");
            System.out.println("반갑습니다.");
            System.out.println();
            System.out.println("문제를 드리겠습니다.");



            String type = "";
            String txt = "";


            // Yes: 0 No: 1
            // ----------------------------------------------------
            System.out.println("Q1. 나는 사실  ");
            System.out.println("1번 : 백엔드보다 프론트엔드가 좋다. ");
            System.out.println("2번 : 백엔드가 잘 맞는다. ");
            int a = sc.nextInt();
            Sum.sumA(a);
            System.out.println("Q2. 나는 사실 ");
            System.out.println("1번 : 조원보다 조장이 되고 싶었다. ");
            System.out.println("2번 : 조원으로 만족한다.");
            a = sc.nextInt();
            Sum.sumA(a);
            System.out.println("Q3.나는 관종이다.");
            System.out.println("1번 : 그렇다.");
            System.out.println("2번 : 아니다. ");
            a = sc.nextInt();
            Sum.sumA(a);
            // Yes 2개 이상 -> E 출력
            System.out.println("-----------------------");
            // ---------------------------------------------------
            System.out.println("Q4.선생님이 모르는 걸 알려주실 때 나는");
            System.out.println("1번 : 그러려니 하고 외운다.");
            System.out.println("2번 : 외우기 전에 원리를 이해하고 싶다. ");
            int b = sc.nextInt();
            Sum.sumB(b);
            System.out.println("Q5.보조 선생님 학원에서 우리 반 감시하라고 보낸 스파이 아니에요?");
            System.out.println("1번 : 뭐 그런 생각까지 해?");
            System.out.println("2번 : 마음속으로 스파이가 된 자신을 상상해 본다.");
            b = sc.nextInt();
            Sum.sumB(b);
            System.out.println("Q6.지금부터 아무것도 생각하지 마!");
            System.out.println("1번 : (생각 안 함)");
            System.out.println("2번 : 생각을 안 하는 게 뭐지? 생각을 안 한다고 생각하는 건 생각을 하는 건가? " + "생각을 하지 않는 건가? 아무 생각도 안 하는 게 가능해? ");
            b = sc.nextInt();
            Sum.sumB(b);
            System.out.println("-----------------------"); //
            // Yes 2개 이상 -> S 출력 System.out.println("-----------------------"); //
//		 ---------------------------------------------------
            System.out.println("Q7.약속 시간에 1시간이나 늦은 친구,");
            System.out.println("1번 : 사과 이전에 늦은 이유가 궁금하다.");
            System.out.println("2번 : 친구의 진심을 담은 사과에 마음이 풀린다. ");
            int c = sc.nextInt();
            Sum.sumC(c);
            System.out.println("Q8.나는 대화를 할 때");
            System.out.println("1번 : 사람보다 챗지피티와 대화하는 게 편하다.");
            System.out.println("2번 : 당연히 사람이 더 편하다.");
            c = sc.nextInt();
            Sum.sumC(c);
            System.out.println("Q9.더 기분 좋은 칭찬은?");
            System.out.println("1번 : 너 천재임?");
            System.out.println("2번 : 너 천사임?");
            c = sc.nextInt();
            Sum.sumC(c);
            // Yes 2개 이상 -> T 출력
            System.out.println("-----------------------"); //
//		  --------------------------------------------------- // Yes 2개 이상 -> P 출력
            System.out.println("Q10.할 일이 쌓였을 때");
            System.out.println("1번 : 손에 집히는 대로 시작한다. ");
            System.out.println("2번 : 우선 계획을 세운다. ");
            int d = sc.nextInt();
            Sum.sumD(d);
            System.out.println("Q11.둘 중 더 나은 상황은?");
            System.out.println("1번 : 아무 일정이 없을 때 ");
            System.out.println("2번 : 모든 일정이 정해져 있을 때");
            d = sc.nextInt();
            Sum.sumD(d);
            System.out.println("Q12.팀플에서 내가 맡고 싶은 일은?");
            System.out.println("1번 : 정리하고 기록하는 일");
            System.out.println("2번 : 아이디어를 내는 일");
//            test.mbti = "ESTP";
            d = sc.nextInt();
            Sum.sumD(d);

            // 0 or 1 일 때 E S T P 가 나오도록 수정
            // ---------------------------------------------------
            System.out.println();
            System.out.println();
            if (Sum.sum1 < 2 && Sum.sum2 < 2 && Sum.sum3 < 2 && Sum.sum4 < 2) {
                test.mbti = "ESTP";
                type = "쿠로미";
                txt = "쿠로미는 귀여운 외모와 더불어 적극적이며 열정적인 쿨내나는 캐릭터입니다.\n" +
                        "\n" +
                        "#YOLO #임기응변 #선입견 없음 #분위기 잘탐\n" +
                        "#스릴♡모험♡여행♡ #쿨함의 대명사 #가끔 공격적\n";

            } else if (Sum.sum1 < 2 && Sum.sum2 < 2 && Sum.sum3 < 2) {
                // System.out.println("ESTJ");
                test.mbti = "ESTJ";
                type = "세일러 마스";
                txt = "세일러 마스는 우아하고 열정적인 동료애를 가진 정의롭고 카리스마 있는 캐릭터입니다.\n"+
                        "\n" +
                        "#완벽주의 #자신감 #창의력부족 #결단력\n" +
                        "#빈틈없음 #워커홀릭 #똑부러짐 #꼰대\n";

            } else if (Sum.sum1 < 2 && Sum.sum2 < 2 && Sum.sum4 < 2) {
                // System.out.println("ESFP");
                test.mbti = "ESFP";
                type = "루피";
                txt = "루피는 무모하지만 용감한 해적으로 매사에 최선을 다하는 쾌활하고 긍정적인 원피스의 주인공입니다.\n"+
                        "\n" +
                        "#분위기 메이커 #행동파 #때때로 산만 #낙관주의자\n" +
                        "#매사에 즐거움 #공사구별 어려움 #붙임성 #음식사진 다량보유\n";

            } else if (Sum.sum1 < 2 && Sum.sum2 < 2) {
                // System.out.println("ESFJ");
                test.mbti = "ESFJ";
                type = "도라에몽";
                txt = "도라에몽은 착하지만 가끔 고집이 센 로봇 고양이로, 진구의 든든한 조력자입니다.\n"+
                        "\n" +
                        "#칭찬 자판기 #오지랖 #가정적 #관심에 민감\n" +
                        "#팔랑귀 #정많음 #팀플 선호 #서비스 정신 투철\n";

            } else if (Sum.sum1 < 2 && Sum.sum3 < 2 && Sum.sum4 < 2) {
                // System.out.println("ENTP");
                test.mbti = "ENTP";
                type = "짱구";
                txt = "짱구는 호기심 넘치는 장난기 가득한 아이로 친구들과 함께 모험을 즐기는 캐릭터입니다.\n"+
                        "\n" +
                        "#논쟁가 #마이웨이 #겉인싸 속아싸 #고집쎔\n" +
                        "#다재다능 #아이디어 부자 #실행력은 약함 #난 언제나 옳아\n";

            } else if (Sum.sum1 < 2 && Sum.sum3 < 2) {
                // System.out.println("ENTJ");
                test.mbti = "ENTJ";
                type = "프리저";
                txt = "프리저는 냉철하고 계산적인 성향을 가진 동시에 독보적인 힘과 권력을 자랑하는 드래곤볼의 캐릭터입니다.\n"+
                        "\n" +
                        "#야망가 #극도의 효율 추구 #독재자 #공감능력부족\n" +
                        "#솔직 #워커홀릭 #철저한 공사구분 #제임스 고슬링\n";


            } else if (Sum.sum1 < 2 && Sum.sum4 < 2) {
                // System.out.println("ENFP");
                test.mbti = "ESFP";
                type = "뽀로로";
                txt = "뽀로로는 호기심 많고 활발한 성격의 펭귄으로, 모험을 즐기며 쾌활한 에너지를 뿜어냅니다.\n" +
                        "\n" +
                        "#이동건 #불타는 열정 #감성 충만 #자유로운 영혼\n" +
                        "#생각하기 전 행동 #친화력의 화신 #관종 #하지만은근낯가림\n";

            } else if (Sum.sum1 < 2) {
                // System.out.println("ENFJ");
                test.mbti = "ESFJ";
                type = "피카츄";
                txt = "피카츄는 항상 주인공의 곁을 지키는 정의롭고 충실한 친구같은 포켓몬입니다.\n"
                        + "\n" +
                        "#붙임성 #자기관리 #소수보단 다수의 친구 #손절 잘 못함\n" +
                        "#의리파 #멘탈강함 #핵인싸 #감수성 풍부 #알잘딱깔센\n";
            } else if (Sum.sum2 < 2 && Sum.sum3 < 2 && Sum.sum4 < 2) {
                // System.out.println("ISTP");
                test.mbti = "ISTP";
                type = "뮬란";
                txt = "뮬란은 결단력이 있으며, 전통적인 고정관념에 정면으로 맞서는 자유로운 영혼의 디즈니 캐릭터입니다.\n"
                        + "\n" +
                        "#인생은 혼자 #겉바속촉 #장인정신 #타인에 무관심\n" +
                        "#마이웨이 #기브앤테이크 #빈말 못함 #심플이즈베스트\n";
            } else if (Sum.sum2 < 2 && Sum.sum3 < 2) {
                // System.out.println("ISTJ");
                test.mbti = "ISTJ";
                type = "징징이";
                txt = "징징이는 스폰지밥의 이웃으로 늘 예민하지만 정직하고 깊은 인내심을 가진 캐릭터입니다.\n"
                        + "\n" +
                        "#보수적 #질서정연 #남모를 취미 #슈퍼 진지\n" +
                        "#모범생 #동방예의지국 #인내 #현실적 #한국인 표준\n";
            } else if (Sum.sum2 < 2 && Sum.sum4 < 2) {
                // System.out.println("ISFP");
                test.mbti = "ISFP";
                type = "해리포터";
                txt = "해리포터는 강인함을 지닌 마법사로, 소심한 면모가 있지만 누구보다 강인하게 시련에 맞서는 캐릭터입니다.\n"
                        + "\n" +
                        "#겸손 #친절 #평등 #현재를 즐김 #나만의 공간\n" +
                        "#소극적 #부드러움 #서포트특화 #강현욱\n";
            } else if (Sum.sum2 < 2) {
                // System.out.println("ISFJ");
                test.mbti = "ISFJ";
                type = "캡틴 아메리카";
                txt = "캡틴 아메리카는 뛰어난 도덕성을 바탕으로 정의를 위해 싸우는 히어로 캐릭터입니다.\n"
                        + "\n" +
                        "#예의바름 #참다가 선넘으면 칼차단 #부담多 #성실\n" +
                        "#속깊음 #주변인 잘챙김 #평화주의자 #박명회 선생님\n";
            } else if (Sum.sum3 < 2 && Sum.sum4 < 2) {
                // System.out.println("INTP");
                test.mbti = "INTP";
                type = "셜록홈즈";
                txt = "셜록홈즈는 뛰어난 추리력과 냉철한 두뇌를 바탕으로 미스터리한 사건들을 해결해 나가는 탐정입니다.\n"
                        + "\n" +
                        "#인간적인 로봇 #게으른 천재 #개인주의 #팩폭\n" +
                        "#귀차니스트 #빈말 못함 #목적없는 지식탐구 #권수민\n";

            } else if (Sum.sum3 < 2) {
                // System.out.println("INTJ");
                test.mbti = "INTJ";
                type = "타노스";
                txt = "타노스는 극단적인 신념을 가지고 인류를 심판하려 드는 빌런 캐릭터입니다.\n"
                        + "\n" +
                        "#멍청하면 손절 #블랙유머 #독립적 #가장 로봇같은 인간\n" +
                        "지적활동 #은근허당 #능력주의 #귀여운거좋아 #자기반성\n";

            } else if (Sum.sum4 < 2) {
                // System.out.println("INFP");
                test.mbti = "INFP";
                type = "마이 멜로디";
                txt = "마이 멜로디는 순수하고 착한 토끼로 마음이 약하지만 여차할 때는 용기를 내는 캐릭터입니다.\n"
                        + "\n" +
                        "#감성충만 #평화주의 #잡생각多多 #눈치많이봄\n" +
                        "#감정이입 #이상과 현실의 괴리 #망상多多 #예술적 기질\n";

            } else {
                // System.out.println("INFJ");
                test.mbti = "INFJ";
                type = "엘사";
                txt = "엘사는 언제나 책임감 있고 강인하지만 그 내면에는 따뜻한 마음을 품고 있는 캐릭터입니다.\n"
                        + "\n" +
                        "#외강내유 #좁고 깊은 인간관계 #극단적 #생각多\n" +
                        "#겸손 #완벽주의 #애늙은이 #예수와 히틀러가 공존\n";
            }

            test.mbtiA();
            System.out.println("#" + test.name + "#" + "님과 닳은 캐릭터는 #" + type + "# 입니다.");
            System.out.println("#" + txt + "#");
        }
    }

