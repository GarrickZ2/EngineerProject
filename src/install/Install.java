package install;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/*
 * @version 1.3
 * We can choose install mode
 * 
 */


public class Install {
	
	public static final String root = "data";
	ArrayList<String> dirname = new ArrayList<String>(); //Store folder names
	ArrayList<String> filename = new ArrayList<String>(); //Store file names
	
	public void Default_folder() { //Add default folder names into list "dirname"
		dirname.add(root);
		dirname.add(root+"\\recipients");
		dirname.add(root+"\\dataprocess");
	}
	
	public void Default_file() { //Add default file names into list "filename"
		filename.add(root+"\\menu.csv");
		filename.add(root+"\\order.csv");
		filename.add(root+"\\membership.csv");
		filename.add(root+"\\recipients\\recdata.csv");
	}
	
	public void Add_new_dir(String s) { //For future use when need to add new folder (Undetermined)
		filename.add(s);
	}
	
	public void Add_new_file(String s) { //For future use when need to add new file (Undetermined)
		filename.add(s);
	}
	
	public void Folder_generation() { //Generate the folders if they are not exist, else it will do nothing
		this.Default_folder();
		for(int i=0;i<dirname.size();i++) {
			File f = new File(dirname.get(i));
			if(!f.exists()) {
				f.mkdirs();
				System.out.println("Folder "+dirname.get(i)+" create Success.");
			}
			else return;
		}
	}
	
	public void File_generation() { //Generate the files if they are not exist, else it will throw exception 
		this.Default_file();
		for(int i=0;i<filename.size();i++) {
			try {
				File f = new File(filename.get(i));
				if(f.createNewFile())
					System.out.println("File "+filename.get(i)+" create Success.");
				else System.out.println("File Exist.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void Dir_generation() { //Must control the folders are created before files
		this.Folder_generation();
		this.File_generation();
	}

	public static void uninstall(String dir) { //Uninstall all the file
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
	
	public Install(int i) {
		if(i==0) { //Repair, install missing files
			this.Dir_generation();
			System.out.println("Repair success");
		}
		else {
			if(i==-1) { //Uninstall
				uninstall(root);
				System.out.println("Uninstall success");
			}
		else { //Forced reinstall, default install mode
			uninstall(root);
			this.Dir_generation();
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
				Install is = new Install(1);
				break;
			}
			case "force": {
				Install is = new Install(2);
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
