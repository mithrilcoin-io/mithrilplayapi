package io.mithrilcoin.api.biz.rate.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import io.mithril.vo.rate.Memberrate;
import io.mithril.vo.rate.Rate;
import io.mithril.vo.rate.Ratehistory;

@Repository
public interface RateMapper {
	
	public Memberrate insertMemberrate(Memberrate rate);
	
	public ArrayList<Memberrate> selectMemberrateByMemberIdx(long member_idx);
	
	public ArrayList<Memberrate> selectMemberrate(@Param("member_idx") long member_idx, @Param("rate_idx") long rate_idx);
	
	public Memberrate selectLastMemberrateByMemberIdx(long member_idx);
	
	public ArrayList<Rate> selectRatelist();
	
	public Rate selectRateByName(String name);
	
	public Ratehistory insertRatehistory(Ratehistory ratehistory);
	
	public Ratehistory selectLastRatehistoryByMemberIdx(long member_idx);	
	
	public long selectRankgrade(long amount);
	
}