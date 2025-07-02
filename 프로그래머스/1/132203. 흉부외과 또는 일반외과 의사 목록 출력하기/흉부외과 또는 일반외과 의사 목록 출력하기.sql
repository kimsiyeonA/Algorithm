-- 코드를 입력하세요
SELECT `DR_NAME`, `DR_ID`, `MCDP_CD`, date_format(`HIRE_YMD`,'%Y-%m-%d')
from `doctor`
where `mcdp_cd` in ('CS','GS')
order by `HIRE_YMD` desc, `DR_NAME`