package install;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Huang
 * @version 1.2
 */
public class Install {
	public static final String ROOT = "data";
	ArrayList<String> dirname = new ArrayList<String>();
	ArrayList<String> filename = new ArrayList<String>();


	/**
	 * Create default folders
	 */
	public void defaultFolder() {

		dirname.add(ROOT);
		dirname.add(ROOT+"\\recipients");
		dirname.add(ROOT+"\\dataprocess");
	}

	/**
	 * Create default files
	 */
	public void defaultFile() {

		filename.add(ROOT+"\\menu.csv");
		filename.add(ROOT+"\\order.csv");
		filename.add(ROOT+"\\member.csv");
	}

	/**
	 * For future use, if needs to add new folder
	 * @param s new folder name
	 */
	public void addNewDir(String s) {

		dirname.add(s);
	}

	/**
	 * For future use, if needs to add new files
	 * @param s new file name
	 */
	public void addNewFile(String s) {

		filename.add(s);
	}

	/**
	 * Generate folders as path
	 */
	public void folderGeneration() {

		this.defaultFolder();
		for (String s : dirname) {
			File f = new File(s);
			if (!f.exists()) {
				f.mkdirs();
				System.out.println("Folder " + s + " create Success.");
			} else {
				return;
			}
		}
	}

	/**
	 * Generate files
	 */
	public void fileGeneration() {

		this.defaultFile();
		for (String s : filename) {
			try {
				File f = new File(s);
				if (f.createNewFile()) {
					System.out.println("File " + s + " create Success.");
				} else {
					System.out.println("File Exist.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Generate complete path
	 */
	public void dirGeneration() {
		this.folderGeneration();
		this.fileGeneration();
	}

	/**
	 * Delete all files
	 * @param dir uninstall path
	 */
	public static void uninstall(String dir) {
		File f = new File(dir);
		File[] files;
		if(f.exists()) {
			if(f.isDirectory()) {
				files = f.listFiles();
				assert files != null;
				for(File fi : files) {
					uninstall(fi.getPath());
				}
			}
			f.delete();	
		}
	}
	/**
	 * Write default data to menu
	 */
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
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Constructor, use different mode to do different install work
	 * @param mode mode0 generate missing files and folders, mode-1 uninstall,
	 *                other modes generate all files and folders, if exists, it will be delete
	 */
	public Install(int mode) {
		//Repair, install missing files
		if(mode == 0) {
			this.dirGeneration();
			System.out.println("Repair success");
		}
		else {
			//Uninstall
			if(mode == -1) {
				uninstall(ROOT);
				System.out.println("Uninstall success");
			}
			//Forced reinstall, default install mode
			else {
				uninstall(ROOT);
				this.dirGeneration();
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
				new Install(0);
				break;
			}
			case "force": {
				new Install(1);
				break;
			}
			case "uninstall": {
				new Install(-1);
				break;
			}
			default:
				System.out.println("Doesn't have this instruction. Please select from 'repair', 'force' and 'uninstall'");
				break;
		}
	}

}
