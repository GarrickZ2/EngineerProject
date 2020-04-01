package install;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Huang
 * @version 1.2
 */
public class Install {
	
	public static final String root = "data";
	ArrayList<String> dirname = new ArrayList<String>();
	ArrayList<String> filename = new ArrayList<String>();
	
	public void Default_folder() {

		dirname.add(root);
		dirname.add(root+"\\recipients");
		dirname.add(root+"\\dataprocess");
	}
	
	public void Default_file() {

		filename.add(root+"\\menu.csv");
		filename.add(root+"\\order.csv");
		filename.add(root+"\\membership.csv");
		filename.add(root+"\\recipients\\recdata.csv");
	}
	
	public void Add_new_dir(String s) {

		filename.add(s);
	}
	
	public void Add_new_file(String s) {

		filename.add(s);
	}
	
	public void Folder_generation() {

		this.Default_folder();
		for(int i=0;i<dirname.size();i++) {
			File f = new File(dirname.get(i));
			if(!f.exists()) {
				f.mkdirs();
				System.out.println("Folder "+dirname.get(i)+" create Success.");
			}
			else {
				return;
			}
		}
	}
	
	public void File_generation() {

		this.Default_file();
		for(int i=0;i<filename.size();i++) {
			try {
				File f = new File(filename.get(i));
				if(f.createNewFile()) {
					System.out.println("File "+filename.get(i)+" create Success.");
				} else {
					System.out.println("File Exist.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void Dir_generation() {
		this.Folder_generation();
		this.File_generation();
	}

	public static void uninstall(String dir) {
		File f = new File(dir);
		File[] files;
		if(f.exists()) {
			if(f.isDirectory()) {
				files = f.listFiles();
				for(File fi : files) {
					uninstall(fi.getPath());
				}
			}
			f.delete();	
		}
	}

	public static void generalDefaultMenu(){
		try {
			File csv = new File("data/menu.csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true));
			bw.write("9.0");
			bw.newLine();
			bw.write("1.0" + "," + "true" );
			bw.newLine();
			bw.write("1.0" + "," + "true" );
			bw.newLine();
			bw.write("1.0" + "," + "true" );
			bw.newLine();
			bw.write("2.0" + "," + "true" );
			bw.newLine();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Install(int mode) {
		//Repair, install missing files
		if(mode == 0) {
			this.Dir_generation();
			System.out.println("Repair success");
		}
		else {
			//Uninstall
			if(mode == -1) {
				uninstall(root);
				System.out.println("Uninstall success");
			}
			//Forced reinstall, default install mode
			else {
				uninstall(root);
				this.Dir_generation();
				generalDefaultMenu();
				System.out.println("Install success");
			}
		}
	}

	public static void main(String[] args) {
		if(args.length == 0) {
			Install is = new Install(1);
			return;
		}
		switch (args[0]) {
			case "repair": {
				Install is = new Install(0);
				break;
			}
			case "force": {
				Install is = new Install(1);
				break;
			}
			case "uninstall": {
				Install is = new Install(-1);
				break;
			}
			default:
				System.out.println("Doesn't have this instruction. Please select from 'repair', 'force' and 'uninstall'");
				break;
		}
	}

}
