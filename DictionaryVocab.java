package miniproject;

import java.util.*;

/**
 *
 * @author Sakdinan Khamnang   5907101013
 */
public class TestterClass 
{
    public static void main(String[] args){
	        Dictionary Input = new Dictionary();
        Scanner sc = new Scanner(System.in);
 
        System.out.println("      WELCOME TO DICTIONARY   ");
        System.out.println("1. LOADING WORD OF DICTIONARY ");
        System.out.println("***********************************");
        System.out.print(" PLEASE CHOOSE 1 TO CONTINUE :: ");
        
        int Choice = sc.nextInt();
                      //COPY WORD WITH MY FRIEND
        switch(Choice){
            case 1 :Input.insert("Ability","ความสามรถ"); 
                    Input.insert("Accident","อุบัติเหตุ");
                    Input.insert("Adventure","การผจญภัย");
                    
                    Input.insert("Beggar","คนขอทาน"); 
                    Input.insert("Blanket","ผ้าห่ม");
                    Input.insert("Bookcase","ตู้หนังสือ");
                    
                    Input.insert("Calculator","เครื่องคิดเลข");
                    Input.insert("Ceiling","เพดาน");
                    Input.insert("Cheerful","ร่าเริง");
                    
                    Input.insert("Diligent","ขยัน");
                    Input.insert("Dread","หวาดกลัว");
                    Input.insert("Dustbin","ถังขยะ");
                    
                    Input.insert("Editor","บรรณาธิการ");
                    Input.insert("Engineer","วิศวกร");
                    Input.insert("Explorer","นักสำรวจ");
                    
                    Input.insert("Garment","เสื้อผ้า");
                    Input.insert("Genius","อัจฉริยะ");
                    Input.insert("Govern","ปกครอง");
                    Input.insert("Gun","ปืน");
                    
                    Input.insert("Hermit","ฤๅษี");
                    Input.insert("Horrible","น่ากลัว");
                    Input.insert("Hunter","นายพราน");
                    
                    Input.insert("Idiom","สำนวน");
                    Input.insert("Impolite","หยาบคาย");
                    Input.insert("Intend","ตั้งใจ");
                    
                    Input.insert("Jasmine","ต้นมะลิ");
                    Input.insert("Journey","การเดินทาง");
                    Input.insert("Justice","ความยุติธรรม");
                    
                    Input.insert("Keeper","ผู้เก็บรักษา");
                    Input.insert("Kingdom","อาณาจักร");
                    Input.insert("Knowledge","ความรู้");
                    
                    Input.insert("Layoff","การเลิกจ้าง");
                    Input.insert("Legend","ตำนาน");
                    Input.insert("License","ใบอนุญาติ");
                    
                    Input.insert("Manniac","คนบ้า");
                    Input.insert("Meeting","การประชุม");
                    Input.insert("Miracle","อัศจรรย์");
                    
                    Input.insert("Narration","การบรรยาย");
                    Input.insert("Network","เครือข่าย");
                    Input.insert("Nutrition","โภชนาการ");
                    
                    Input.insert("Obedient","เชื่อฟัง");
                    Input.insert("Ocean","มหาสมุทร");
                    Input.insert("Opportunity","โอกาส");
                    
                    Input.insert("Parliament","รัฐสภา");
                    Input.insert("Permission","การยินยอม");
                    Input.insert("Pleasure","ความพอใจ");
                    
                    Input.insert("Quandary","ความอึดอัดใจ");
                    Input.insert("Quarrel","ทะเลาะ");
                    Input.insert("Queer","ประหลาด");
                    
                    Input.insert("Register","ลงทะเบียน");
                    Input.insert("Rocket","จรวด");
                    Input.insert("Ruthless","โหดเหี้ยม");
                    
                    Input.insert("Satellite","ดาวเทียม"); 
                    Input.insert("Scientist","นักวิทยาศาสตร์");
                    Input.insert("Skeleton","โครงกระดูก");
                    
                    Input.insert("Talkative","พูดมาก");
                    Input.insert("Timetable","ตารางเวลา");
                    Input.insert("Tournament","การแข่งขัน");
                    
                    Input.insert("Uncomfortable","ไม่สะดวก");
                    Input.insert("Upset","สับสน");
                    Input.insert("Useless","ไร้ประโยชน์");
                    
                    Input.insert("Vacillate","เปลี่ยนแปลง");
                    Input.insert("Ventilate","ระบายลม");
                    Input.insert("Voyage","การเดินทางไกล");
                    
                    Input.insert("Warehouse","คลังสินค้า");
                    Input.insert("Welfare","สวัสดิการ");
                    Input.insert("Wicked","โหดร้าย");
                    
                    Input.insert("X ray","รังสีเอ็กซ์");
                    Input.insert("Xerox","ถ่ายเอกสาร");
                    Input.insert("Xmas","คริสต์มาส");
                    
                    Input.insert("Yacht","เรือท่องเที่ยว");
                    Input.insert("Yield","ผลิต");
                    Input.insert("Yourself","ตัวเอง");
                    
                    Input.insert("Zealously","กระตือรือร้น"); 
                    Input.insert("Zenith","สุดยอด");
                    Input.insert("Zoology","สัตววิทยา");
                    
                    System.out.println("    LOAD FILE IS COMPLETE  ");            
                    Input.MAINMENU();
                    break;
            default :System.out.print(" PLEASE SEECT 1 ONLY ");
            
	    }
    }
}
